package com.orchids.spring.test;

import com.orchids.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author qwh
 * @ Date 2023/12/7 16:51
 */
public class UserLifeTest {
    @Test
    public void Scope(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("life.xml");
        User user1 = ioc.getBean(User.class);
        User user2 = ioc.getBean(User.class);
        System.out.println(user2 == user1);
    }
    @Test
    public void Live(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("life.xml");
        User user = ioc.getBean("userLife",User.class);
        System.out.println("生命周期：4、通过IOC容器获取bean并使用");
        ioc.close();
    }
    @Test
    public void BeanFactory(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("life.xml");
        User user = ioc.getBean("userFactory",User.class);
        System.out.println(user.toString());
    }

}
