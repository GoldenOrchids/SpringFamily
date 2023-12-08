package com.orchids.springaop.xml;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-8:56
 */
public class ValidateAspect {

    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }
}
