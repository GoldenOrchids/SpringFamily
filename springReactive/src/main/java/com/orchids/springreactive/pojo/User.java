package com.orchids.springreactive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: QWH
 * @Date: 2023-12-08-15:28
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String gender;

    private String email;
}
