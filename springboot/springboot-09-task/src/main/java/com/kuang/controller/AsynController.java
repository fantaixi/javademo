package com.kuang.controller;

import com.kuang.service.AsynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fantaixi
 * @create 2021-01-21 0:07
 */
@RestController
public class AsynController {
    @Autowired
    AsynService asynService;

    @RequestMapping("/hello")
    public String hello(){
        asynService.hello();
        return "ok";
    }
}
