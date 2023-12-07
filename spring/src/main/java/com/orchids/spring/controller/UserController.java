package com.orchids.spring.controller;

import com.orchids.spring.service.UserService;

/**
 * @ Author qwh
 * @ Date 2023/12/7 18:46
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
