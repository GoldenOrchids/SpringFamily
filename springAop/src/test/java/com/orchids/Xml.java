package com.orchids;



import com.orchids.springaop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-8:57
 */
public class Xml {
    @Test
    public void aopByXml(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,1);
    }
}
