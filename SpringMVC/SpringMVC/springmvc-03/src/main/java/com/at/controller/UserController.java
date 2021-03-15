package com.at.controller;

import com.at.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fantaixi
 * @create 2021-01-10 11:13
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //http://localhost:8080/user/t1?username=aaa  @RequestParam  解决名字不一样
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        //接受前端参数
        System.out.println("接受的参数为"+ name);
        //将返回的结果传递给前端
        model.addAttribute("msg",name);
        //跳转视图
        return "hello";
    }

    //前端接受的是一个对象

    /**
     * 1.接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
     * 2.假设传递的是一个对象User，匹配User对象中的字段名，如果名字一致则ok，否则匹配不到
     */
    @GetMapping("/t2")
    public String test2(User user){
        //接受前端参数
        System.out.println(user);
        //跳转视图
        return "hello";
    }

    /**
     * Model只是用来传输数据的，并不会进行业务的寻址。
     * ModelAndView却是可以进行业务寻址的，就是设置对应的要请求的静态文件，这里的静态文件指的是类似jsp的文件。
     * 两者还有一个最大的区别，那就是Model是每一次请求都必须会带着的，但是ModelAndView是需要我们自己去新建的
     */
}
