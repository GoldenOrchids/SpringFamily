package com.orchids.service.impl;

import com.github.pagehelper.PageInfo;
import com.orchids.pojo.Employee;
import com.orchids.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author qwh
 * @ Date 2023/12/10 14:01
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        return null;
    }
}
