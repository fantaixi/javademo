package com.kuang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author fantaixi
 * @create 2021-01-12 22:22
 */
//拦截登录
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //放行：判断什么情况下登录

        //第一次登录是没有session的
        if (session.getAttribute("userInfo") != null){
            return true;
        }

        //登录页面也会放行
        if (request.getRequestURI().contains("goLogin")){
            return true;
        }

        //第一次登录放行
        if (request.getRequestURI().contains("login")){
            return true;
        }

        //判断什么情况下没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
