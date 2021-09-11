package proxy;

import org.junit.Test;

public class test
{
    @Test
    public void test()
    {
       //获取代理对象
        ProxyFactory proxyFactory=new ProxyFactory(new TeachDao());
        TeachDao proxyInstance = (TeachDao)proxyFactory.getProxyInstance();
        System.out.println("使用intercept拦截器进行拦截");
         proxyInstance.show();
        System.out.println("使用NoOp.INSTANCE,空实现拦截器");
        proxyInstance.teach();
    }
}
