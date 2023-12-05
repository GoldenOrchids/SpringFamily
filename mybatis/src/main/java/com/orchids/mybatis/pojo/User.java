package com.orchids.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ Author qwh
 * @ Date 2023/12/5 20:21
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String gender;

    private String email;
}
