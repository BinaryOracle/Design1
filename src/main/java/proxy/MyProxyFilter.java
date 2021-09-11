package proxy;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class MyProxyFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        //如果方法名叫show
        if(method.getName().equals("show"))
            return 0;//让第一个拦截器进行处理
        return 1;//让第二个拦截器进行处理
    }
}
