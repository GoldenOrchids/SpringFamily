package com.orchids.autowire;

import com.orchids.controller.UserController;
import com.orchids.dao.UserDao;
import com.orchids.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author qwh
 * @ Date 2023/12/7 20:16
 */
public class AnnotationTest {
    @Test
    public void test1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = ioc.getBean("controller", UserController.class);
        System.out.println(userController);
        UserService userService = ioc.getBean("userServiceImpl", UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
        System.out.println(userDao);
        userController.saveUser();
    }
    @Test
    public void test2(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = ioc.getBean( UserController.class);
        System.out.println(userController);
        UserService userService = ioc.getBean("userServiceImpl", UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
        System.out.println(userDao);
        userController.saveUser();
    }
    @Test
    public void test3(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = ioc.getBean( "controller",UserController.class);
        System.out.println(userController);
        UserService userService = ioc.getBean("userServiceImpl", UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
        System.out.println(userDao);
        userController.saveUser();
    }
}
