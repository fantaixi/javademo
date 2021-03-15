package com.kuang.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-11 7:33
 */
@RestController  //不走视图解析器，会直接返回一个字符串
//@Controller
public class UserController {

    //produces:指定响应体返回类型和编码
    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    @RequestMapping("/j1")
    //@ResponseBody //不走视图解析器，会直接返回一个字符串
    public String json() throws JsonProcessingException {
        User user = new User("a", 18, "男");

        //jackson ，  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/j2")
    //@ResponseBody //不走视图解析器，会直接返回一个字符串
    public String json2() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("a", 18, "男");
        User user2 = new User("a", 18, "男");
        User user3 = new User("a", 18, "男");
        User user4 = new User("a", 18, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j3")
    public String json3()  {

        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j4")
    //@ResponseBody //不走视图解析器，会直接返回一个字符串
    public String json4()  {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("a", 18, "男");
        User user2 = new User("a", 18, "男");
        User user3 = new User("a", 18, "男");
        User user4 = new User("a", 18, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String string = JSON.toJSONString(userList);
        return string;
    }
}
