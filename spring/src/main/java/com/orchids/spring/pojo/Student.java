package com.orchids.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: QWH
 * @Date: 2023-12-07-10:44
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Person{
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
