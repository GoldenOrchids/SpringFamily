package com.orchids.mapper;

import com.orchids.pojo.Employee;

import java.util.List;

/**
 * @ Author qwh
 * @ Date 2023/12/10 13:40
 */
public interface EmployeeMapper {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}

