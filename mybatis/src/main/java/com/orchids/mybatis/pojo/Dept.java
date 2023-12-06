package com.orchids.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

/**
 * @Auther: QWH
 * @Date: 2023-12-06-15:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer deptId;

    private String deptName;

    private List<Emp> emps;
    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
