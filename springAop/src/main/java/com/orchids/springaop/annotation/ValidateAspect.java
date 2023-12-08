package com.orchids.springaop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-8:56
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {

    //@Before("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    @Before("com.orchids.springaop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }
}
