package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @author fantaixi
 * @create 2021-01-17 1:33
 */
//在templates目录下面的所有页面，只能通过controller跳转
//需要引入thymeleaf模板引擎
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","这不科学......");
        model.addAttribute("users", Arrays.asList("a","b","c"));
        return "test";
    }
}
