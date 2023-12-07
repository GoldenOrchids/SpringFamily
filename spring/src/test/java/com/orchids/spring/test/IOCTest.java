package com.orchids.spring.test;

import com.orchids.spring.pojo.Clazz;
import com.orchids.spring.pojo.HelloWorld;
import com.orchids.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: QWH
 * @Date: 2023-12-07-10:48
 */
public class IOCTest {
    /*##############################获取bean###############################################*/
    @Test //id
    public void HelloOne(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld iocBean = (HelloWorld) ioc.getBean("HelloWorld");
        String string = iocBean.toString();
        System.out.println(string);
    }
    @Test //属性
    public void HelloTwo(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld iocBean = (HelloWorld) ioc.getBean(HelloWorld.class);
        String string = iocBean.toString();
        System.out.println(string);
    }
    @Test //属性和id
    public void HelloThree(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld iocBean = (HelloWorld) ioc.getBean("HelloWorld", HelloWorld.class);
        String string = iocBean.toString();
        System.out.println(string);
    }
    /*##################依赖注入#########################################################*/
    @Test //setter
    public void studentOne(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentOne",Student.class);
        String string = student.toString();
        System.out.println(student);
    }

    @Test //构造器注入bean类中要有对应的构造方法
    public void studentTwo(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentTwo",Student.class);
        String string = student.toString();
        System.out.println(student);
    }
    /*##################特殊情况#########################################################*/
    @Test //特殊情况
    public void studentThree(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentThree",Student.class);
        String string = student.toString();
        System.out.println(student);
    }
    /*########################为类类型属性赋值#############################################################################*/
    @Test //为类类型属性赋值 引用外部 bean
    public void studentFour(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentFour",Student.class);
        String string = student.toString();
        System.out.println(student);
    }
    @Test //为类类型属性赋值 内部bean
    public void studentFive(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentFive",Student.class);
        String string = student.toString();
        System.out.println(student);
    }
    @Test //为类类型属性赋值 联级
    public void studentSix(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentSix",Student.class);
        String string = student.toString();
        System.out.println(student);
    }
    /*#####################################################################################################*/
    @Test //为为数组类型属性赋值
    public void studentArray(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentArray",Student.class);
        String string = student.toString();
        System.out.println(student);
    }
//##################################为集合类型属性赋值#################################################-->

    @Test //为为数组类型属性赋值
    public void clazzOneList(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
        String string = clazz.toString();
        System.out.println(string);
    }
//##################################为map类型属性赋值#################################################-->
    @Test //为为数组类型属性赋值
    public void studentMap(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentMap", Student.class);
        System.out.println(student.toString());

    }

}
