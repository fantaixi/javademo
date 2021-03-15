package com.kuang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author fantaixi
 * @create 2021-01-17 13:10
 */
//扩展 springmvc
@Configuration
//导入了一个类 DelegatingWebMvcConfiguration：从容器中获取所有的webmvcconfig，加上之后就全面接管了springmvc
//@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {
    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //localhost:8080/a   跳转到test页面
         registry.addViewController("/a").setViewName("test");
    }
}
