package com.orchids.spring.test;

import com.orchids.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author qwh
 * @ Date 2023/12/7 19:20
 */
public class autowire_xmlTEst {
    @Test
    public void testAutowire(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();

    }
}
