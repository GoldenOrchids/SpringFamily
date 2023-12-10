package com.orchids.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ Author qwh
 * @ Date 2023/12/10 13:39
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer empId;

    private String empName;

    private Integer age;

    private String gender;

    private String email;
}
