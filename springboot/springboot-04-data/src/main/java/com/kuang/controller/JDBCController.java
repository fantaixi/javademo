package com.kuang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author fantaixi
 * @create 2021-01-18 16:00
 */
@RestController
public class JDBCController {
    //xxxTemplate springboot 已经配置好的bean，拿来即用
    @Autowired
    JdbcTemplate jdbcTemplate ;


    //查询数据的所有信息，在没有实体类的情况下
    @GetMapping("/userlist")
    public List<Map<String, Object>> userList(){
        String sql="select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return  maps;
    }

    //插入一条数据
    @GetMapping("/adduser")
    public String addUser(){
        String sql="insert into user(id,name,pwd) values (10,'sad','sda')";
        jdbcTemplate.update(sql);
        return  "update-ok";
    }
}
