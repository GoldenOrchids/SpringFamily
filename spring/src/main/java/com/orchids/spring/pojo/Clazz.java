package com.orchids.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @ Author qwh
 * @ Date 2023/12/7 14:39
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    private Integer cid;

    private String cname;

    private List<Student> students;

}
