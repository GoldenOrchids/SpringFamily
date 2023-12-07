package com.orchids.spring.test;

import com.orchids.spring.pojo.HelloWorld;
import com.orchids.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: QWH
 * @Date: 2023-12-07-10:48
 */
public class IOCTest {
    @Test //id
    public void student(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) ioc.getBean("studentId");
        String string = student.toString();
        System.out.println(student);
    }
    @Test //属性
    public void studentOne(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld student = ioc.getBean(HelloWorld.class);
        String string = student.toString();
        System.out.println(student);
    }
    @Test //属性和id
    public void studentTwo(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentId",Student.class);
        String string = student.toString();
        System.out.println(student);
    }
    @Test //setter
    public void studentThree(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentSet",Student.class);
        String string = student.toString();
        System.out.println(student);
    }
    @Test //setter
    public void studentGZQe(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentGZQ",Student.class);
        String string = student.toString();
        System.out.println(student);
    }

}
