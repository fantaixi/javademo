package com.kuang.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author fantaixi
 * @create 2021-01-19 19:07
 */
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
    //授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问，功能页只有对应有权限的人才能访问
        //请求授权的规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/leve1/*").hasAnyRole("vip1")
                .antMatchers("/leve2/*").hasAnyRole("vip2")
                .antMatchers("/leve3/*").hasAnyRole("vip3","vip2","vip3");

        //没有权限默认会到登录页面，需要开启登录的页面
        http.formLogin();

        //关闭csrf功能，不然登录可能存在失败
        http.csrf().disable();
        //开启注销功能
        http.logout().logoutSuccessUrl("/");

        //开启记住我功能，cookie，默认保存两周
        http.rememberMe();
    }

    //认证, springboot2.0以上可以直接使用
    //密码编码PasswordEncoder
    //spring security新增了很多的加密方法
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //这些数据正常应该从数据库中读取  ->  auth.jdbcAuthentication()
        auth.inMemoryAuthentication()
                .withUser("aaa").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2")
                .and()
                .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3");

    }
}
