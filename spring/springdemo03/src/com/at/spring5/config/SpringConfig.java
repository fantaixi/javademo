package com.at.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author fantaixi
 * @create 2021-01-02 4:46
 */
@Configuration  //作为配置类，替代配置文件
@ComponentScan(basePackages = {"com.at.spring5"})  //等同于bean1.xml  <context:component-scan base-package="com.at.spring5"></context:component-scan>
public class SpringConfig {
}
