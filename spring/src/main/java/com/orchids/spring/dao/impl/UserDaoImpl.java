package com.orchids.spring.dao.impl;

import com.orchids.spring.dao.UserDao;

/**
 * @ Author qwh
 * @ Date 2023/12/7 18:50
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
