package com.orchids.springaop.xml;

import org.springframework.stereotype.Component;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-14:22
 */
@Component
public class ValidateAspect {
    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }
}
