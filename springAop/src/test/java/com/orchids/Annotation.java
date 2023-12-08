package com.orchids;

import com.orchids.springaop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-11:26
 */
public class Annotation {
    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(10, 1);
    }
}
