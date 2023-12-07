package com.orchids.spring.service.impl;

import com.orchids.spring.dao.UserDao;
import com.orchids.spring.service.UserService;

/**
 * @ Author qwh
 * @ Date 2023/12/7 18:47
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
