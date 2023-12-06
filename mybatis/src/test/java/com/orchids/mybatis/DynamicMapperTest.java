package com.orchids.mybatis;

import com.orchids.mybatis.mapper.DynamicMapper;
import com.orchids.mybatis.pojo.Emp;
import com.orchids.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ Author qwh
 * @ Date 2023/12/6 18:32
 */
public class DynamicMapperTest {
    /**
     * 根据条件查询员工信息
     * @return
     */
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "张三", 20, "");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }
    @Test
    public void testGetEmpByConditionOne(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "张三", 20, "");
        List<Emp> list = mapper.getEmpByConditionOne(emp);
        list.forEach(System.out::println);
    }
    @Test
    public void testGetEmpByConditionTwo(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "张三", 20, "");
        List<Emp> list = mapper.getEmpByConditionTwo(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "张三", 20, "");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp1 = new Emp(null, "小明1", 20, "男");
        Emp emp2 = new Emp(null, "小明2", 20, "男");
        Emp emp3 = new Emp(null, "小明3", 20, "男");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list);
    }

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Integer[] empIds = new Integer[]{6,7};
        mapper.deleteMoreEmp(empIds);
    }

}
