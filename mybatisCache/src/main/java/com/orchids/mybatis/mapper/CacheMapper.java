package com.orchids.mybatis.mapper;

import com.orchids.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @ Author qwh
 * @ Date 2023/12/6 19:28
 */
public interface CacheMapper {
    /**
     * 根据员工id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     * @param emp
     */
    void insertEmp(Emp emp);

}
