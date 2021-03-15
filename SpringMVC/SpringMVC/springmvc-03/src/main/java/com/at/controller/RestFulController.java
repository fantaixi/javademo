package com.at.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author fantaixi
 * @create 2021-01-10 9:12
 */
@Controller
public class RestFulController {
    //http://localhost:8080/add?a=1&b=2
    //@RequestMapping("/add")
    //public String test(int a, int b, Model model){
    //    int result = a + b;
    //    model.addAttribute("msg","结果为"+result);
    //    return "hello";
    //}

    //RestFul风格  使用@PathVariable接收参数，参数值需要在url进行占位，前端传参的URL：
    //http://localhost:8080/add/a/b
    //@RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    //或者使用
    @GetMapping("/add/{a}/{b}")
    public String test(@PathVariable int a,@PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg","结果1为"+result);
        return "hello";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg","结果2为"+result);
        return "hello";
    }
}
