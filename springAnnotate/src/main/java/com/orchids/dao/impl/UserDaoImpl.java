package com.orchids.dao.impl;

import com.orchids.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @ Author qwh
 * @ Date 2023/12/7 19:53
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
