package com.orchids.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author qwh
 * @ Date 2023/12/9 16:26
 */
@Controller
public class ViewController {
    @RequestMapping("/test/view/thymeleaf")
    public String testThymeleafView(){
        return "love";
    }

    @RequestMapping("/test/view/forward")
    public String testInternalResourceView(){
        return "forward:/test/model";
    }

    @RequestMapping("/test/view/redirect")
    public String testRedirectView(){
        return "redirect:/test/model";
    }
}
