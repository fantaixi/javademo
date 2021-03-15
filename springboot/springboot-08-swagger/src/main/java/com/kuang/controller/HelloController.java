package com.kuang.controller;

import com.kuang.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fantaixi
 * @create 2021-01-20 17:52
 */
@RestController
public class HelloController {

    @ApiOperation("hello控制类")
    @GetMapping("/a")
    public String a(){
        return "hello";
    }

    //只要接口中的返回值存在实体类，就会被扫描到 swagger
    @PostMapping("/user")
    public User user(){
        return new User();
    }
}
