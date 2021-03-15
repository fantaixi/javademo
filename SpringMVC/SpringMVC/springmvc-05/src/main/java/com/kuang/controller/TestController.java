package com.kuang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fantaixi
 * @create 2021-01-12 21:29
 */
@RestController
public class TestController {
    @GetMapping("/t1")
    public String test(){
        System.out.println("test执行了。。。。。。。。。");
        return "hello";
    }
}
