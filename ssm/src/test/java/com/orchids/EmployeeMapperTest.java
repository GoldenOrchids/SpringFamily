package com.orchids;

import com.orchids.mapper.EmployeeMapper;
import com.orchids.pojo.Employee;
import com.orchids.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ Author qwh
 * @ Date 2023/12/10 14:33
 */
public class EmployeeMapperTest {
    @Test
    public void tt() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> list = mapper.getAllEmployee();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
