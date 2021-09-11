package proxy;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

//实现MethodInterceptor接口
public class ProxyFactory implements MethodInterceptor
{
    //需要代理的目标对象
private  Object target;
    ProxyFactory(Object target)
    {
        this.target=target;
    }
    //获取代理对象的方法
    public Object getProxyInstance()
    {
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer=new Enhancer();
        // 设置enhancer对象的父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(target.getClass());
        //设置enhancer的回调对象
        enhancer.setCallbacks(new Callback[]{this, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new MyProxyFilter());
        // 创建代理对象
        return enhancer.create();
    }
    /**
     * @param o cglib生成的代理对象
     * @param method 被代理对象的方法
     * @param objects     传入方法的参数
     * @param methodProxy 代理的方法
     */
    @Override//重写拦截方法
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理中...");
        //执行被代理对象的方法---方式一
        System.out.println("======================");
        System.out.println("动态代理过程中执行被代理对象的方法");
        //这里必须传入被代理的对象，否则会死循环
        //因为代理对象方法调用会触发拦截器
        Object ret= method.invoke(target, objects);
        System.out.println("代理对象的方法的返回值:"+ret);
        System.out.println("======================");
        return ret;

        //方式二
        //下面这种写法会造成死循环，因为调用被代理的方法会触发拦截器
        //Object invoke = methodProxy.invoke(o, objects);
        //因此应该是执行父类的方法--这里必须传入代理对象
        //Object invokeSuper = methodProxy.invokeSuper(o, objects);
        //return invokeSuper;//返回方法返回值
    }
}
