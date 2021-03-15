package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author fantaixi
 * @create 2021-01-12 22:07
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session, Model model){
        //把用户存入session中
        session.setAttribute("userInfo",username);
        model.addAttribute("username",username);
        return "main";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        //把用户存入session中
        session.removeAttribute("userInfo");
        return "main";
    }
}
