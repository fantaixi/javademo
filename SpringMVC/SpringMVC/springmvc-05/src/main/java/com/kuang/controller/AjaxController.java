package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-12 11:05
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        if ("aaa".equals(name)){
            response.getWriter().print("true");
        }
        else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> list = new ArrayList<User>();
        list.add(new User("秦疆1号",3,"男"));
        list.add(new User("秦疆2号",3,"男"));
        list.add(new User("秦疆3号",3,"男"));
        return list; //由于@RestController注解，将list转成json格式返回
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg="";
        if (name != null){
            if ("admin".equals(name)){
                msg = "OK";
            }else
                msg = "erro";
        }
        if (pwd != null){
            if ("123".equals(pwd)){
                msg = "OK";
            }else
                msg = "erro";
        }
        return msg;
    }
}
