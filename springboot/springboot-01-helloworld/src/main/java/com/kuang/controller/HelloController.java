package com.kuang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fantaixi
 * @create 2021-01-14 22:53
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
