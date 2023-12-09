package com.orchids.controller;

import com.sun.jmx.snmp.BerEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ Author qwh
 * @ Date 2023/12/9 10:54
 */
@Controller
public class HelloController {
    @RequestMapping("/") //解析为localhost:8080/上下文路径 --springmvc
    public String protal(){
        //将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "love";
    }
    @RequestMapping(
            value = {"/abc","123"})
    public String value(){
        return "love";
    }
    @RequestMapping(
            value = "/methodPost",
            method = RequestMethod.POST
    )
    public String method1(){
        return "love";
    }
    @RequestMapping(
            value = "/methodGet",
            method = RequestMethod.GET
    )
    public String method2(){
        return "love";
    }
    @GetMapping("/Getmethod")
    public String method3(){
        return "love";
    }
    @PostMapping("/Postmethod")
    public String method4(){
        return "love";
    }
    @RequestMapping(
            value = "/params"
            ,params="username")
    public String params(){
        return "love";
    }
/*    @RequestMapping("/restful/{id}/{username}")
    public String rest(@PathVariable("id") String id,@PathVariable("username") String username){
        System.out.println("id="+id +"username="+username);
        return "love";
    }*/

}
