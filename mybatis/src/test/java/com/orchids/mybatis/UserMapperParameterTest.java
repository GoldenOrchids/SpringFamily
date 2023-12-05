package com.orchids.mybatis;

import com.orchids.mybatis.mapper.UserMapperParameter;
import com.orchids.mybatis.pojo.User;
import com.orchids.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * @ Author qwh
 * @ Date 2023/12/5 22:34
 */
public class UserMapperParameterTest {
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapperParameter mapper = sqlSession.getMapper(UserMapperParameter.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapperParameter mapper = sqlSession.getMapper(UserMapperParameter.class);
        User user = mapper.checkLogin("admin", "123123");
        System.out.println(user);
    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapperParameter mapper = sqlSession.getMapper(UserMapperParameter.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123123");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapperParameter mapper = sqlSession.getMapper(UserMapperParameter.class);
        User user = new User(null, "root", "123123", 33, "女", "123@qq.com");
        mapper.insertUser(user);
    }

    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapperParameter mapper = sqlSession.getMapper(UserMapperParameter.class);
        User user = mapper.checkLoginByParam("admin", "123123");
        System.out.println(user);
    }
}
