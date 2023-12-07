package com.orchids.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @ Author qwh
 * @ Date 2023/12/7 16:34
 */
public class DataSourceTest {
    @Test
    public void datasourceTest() throws SQLException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("datasource.xml");
        DruidDataSource iocBean = ioc.getBean("dataSource", DruidDataSource.class);
        System.out.println(iocBean.getConnection());
    }
}
