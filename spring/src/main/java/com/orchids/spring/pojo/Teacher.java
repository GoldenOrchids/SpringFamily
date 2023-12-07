package com.orchids.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ Author qwh
 * @ Date 2023/12/7 15:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer Tid;

    private String Tname;
}
