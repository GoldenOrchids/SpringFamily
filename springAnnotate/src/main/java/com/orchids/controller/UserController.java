package com.orchids.controller;

import com.orchids.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @ Author qwh
 * @ Date 2023/12/7 19:50
 */
@Controller("controller")
public class UserController {
    @Autowired
    private UserService userService;
    public void saveUser(){
        userService.saveUser();
    }
}
