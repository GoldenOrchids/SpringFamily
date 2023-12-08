package com.orchids;

import com.orchids.springaop.xml.Calculator;
import com.orchids.springaop.xml.CalculatorImpl;
import com.orchids.springaop.xml.CalculatorStaticProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-8:57
 */
public class AopByXML {
    @Test
    public void StaticProxy(){
        CalculatorStaticProxy staticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        int add = staticProxy.add(1, 1);
        System.out.println(add);
    }
    @Test
    public void AOPByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,1);
    }
}
