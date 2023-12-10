package com.orchids.controller;

import com.orchids.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @ Author qwh
 * @ Date 2023/12/9 22:17
 */
@Controller
public class AjaxController {

    @RequestMapping("/test/RequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody:"+requestBody);
        return "success";
    }
    //响应浏览器list集合
    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public List<User> testResponseBody(){
        User user1 = new User(1001,"admin1","123456",23,"男");
        User user2 = new User(1002,"admin2","123456",23,"男");
        User user3 = new User(1003,"admin3","123456",23,"男");
        List<User> list = Arrays.asList(user1, user2, user3);
        return list;
    }


}
