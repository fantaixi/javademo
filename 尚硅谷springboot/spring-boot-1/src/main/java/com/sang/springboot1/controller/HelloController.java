package com.sang.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author fantaixi
 * @create 2020-10-04 1:45
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String helo(){
        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));
        return "success";
    }

    //@RequestMapping({"/","/index.html"})
    //public String index(){
    //    return "index";
    //}
}
