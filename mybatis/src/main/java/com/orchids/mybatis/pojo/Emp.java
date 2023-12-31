package com.orchids.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: QWH
 * @Date: 2023-12-06-15:00
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer empId;

    private String empName;

    private Integer age;

    private String gender;

    private Dept dept;

    public Emp(Integer empId, String empName, Integer age, String gender) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
    }
}
