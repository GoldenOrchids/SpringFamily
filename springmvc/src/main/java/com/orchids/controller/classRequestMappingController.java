package com.orchids.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author qwh
 * @ Date 2023/12/9 14:08
 */
@Controller
@RequestMapping("/hellomvc")
public class classRequestMappingController {
    //此时请求映射所映射的请求的请求路径为：/hellomvc/testRequestMapping
    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        return "springmvc";
    }

}
