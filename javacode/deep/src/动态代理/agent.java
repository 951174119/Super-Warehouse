package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//动态代理可以在不写实现类的情况下实例化接口
public class agent {
    //设计一个方法来返回一个明星对象的代理对象
    public static skill getstart(start obj){
        //生成一个代理对象
        return (skill) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Money");
                //args代表这个方法的参数
                Object rs=method.invoke(obj,args);
                return rs;
            }
        });//类加载器，对象实现的接口列表,代理的核心处理逻辑
    }
}
