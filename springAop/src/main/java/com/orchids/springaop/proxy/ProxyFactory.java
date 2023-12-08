package com.orchids.springaop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-10:29
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        /*
        * classLoader loader:类加载器 加载动态生成的代理带的类加载器
        * class[] interfaces:获取目标对象的所有接口和class对象的数组
        * InvocationHandler :设置代理类中的抽象方法如何重写
        * */
        ClassLoader classLoader =this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("动态代理 日志，方法："+method.getName()+"，参数："+ Arrays.toString(args));
                    //proxy表示代理对象，method表示要执行的方法，args表示要执行的方法到的参数列表
                    result = method.invoke(target,args);
                    System.out.println("动态代理 日志，方法："+method.getName()+"，结果："+ result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("动态代理 日志，方法："+method.getName()+"，异常："+ e);
                }finally {
                    System.out.println("动态代理 日志，方法："+method.getName()+"，方法执行完毕");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}
