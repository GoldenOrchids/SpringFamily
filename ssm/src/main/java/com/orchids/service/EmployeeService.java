package com.orchids.service;

import com.github.pagehelper.PageInfo;
import com.orchids.pojo.Employee;

import java.util.List;

/**
 * @ Author qwh
 * @ Date 2023/12/10 14:00
 */
public interface EmployeeService {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
