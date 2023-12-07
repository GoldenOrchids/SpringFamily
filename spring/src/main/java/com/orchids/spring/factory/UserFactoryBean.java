package com.orchids.spring.factory;

import com.orchids.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ Author qwh
 * @ Date 2023/12/7 18:34
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
