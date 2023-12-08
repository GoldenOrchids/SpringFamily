package com.orchids;

import com.orchids.springaop.proxy.Calculator;
import com.orchids.springaop.proxy.CalculatorImpl;
import com.orchids.springaop.proxy.CalculatorStaticProxy;
import com.orchids.springaop.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-10:31
 */
public class Proxy {
    /**
     * 动态代理有两种：
     * 1、jdk动态代理，要求必须有接口，最终生成的代理类和目标类实现相同的接口
     * 在com.sun.proxy包下，类名为$proxy2
     * 2、cglib动态代理，最终生成的代理类会继承目标类，并且和目标类在相同的包下
     */

    @Test
    public void CalculatorImpl(){
        CalculatorImpl calculator = new CalculatorImpl();
        int add = calculator.add(1, 1);
        System.out.println(add);
    }
    @Test
    public void StaticProxy(){
        CalculatorStaticProxy staticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        int add = staticProxy.add(1, 1);
        System.out.println(add);
    }
    @Test
    public void FactoryProxy(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        int add = proxy.add(1, 1);
        System.out.println(add);

    }
}
