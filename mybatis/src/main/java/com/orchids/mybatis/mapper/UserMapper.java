package com.orchids.mybatis.mapper;

import com.orchids.mybatis.pojo.User;

import java.util.List;

/**
 * @ Author qwh
 * @ Date 2023/12/5 20:20
 */
public interface UserMapper {
    int insertUser();
    int deleteUser();
    int updateUser();
    User getUserById();
    List<User> getUserList();
}
