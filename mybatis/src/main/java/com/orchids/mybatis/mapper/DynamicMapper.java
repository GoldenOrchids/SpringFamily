package com.orchids.mybatis.mapper;

import com.orchids.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ Author qwh
 * @ Date 2023/12/6 18:29
 */
public interface DynamicMapper {
    /**
     * 根据条件查询员工信息
     *  if
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);
    /**
     * 根据条件查询员工信息
     * where
     * @return
     */
    List<Emp> getEmpByConditionOne(Emp emp);
    /**
     * 根据条件查询员工信息
     * trim
     * @return
     */
    List<Emp> getEmpByConditionTwo(Emp emp);
    /**
     * 使用choose查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量添加员工信息
     * @param emps
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
