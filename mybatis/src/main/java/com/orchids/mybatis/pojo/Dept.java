package com.orchids.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @Auther: QWH
 * @Date: 2023-12-06-15:00
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer deptId;

    private String deptName;

    private List<Emp> emps;
}
