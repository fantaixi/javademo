package com.at.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author fantaixi
 * @create 2021-01-02 23:33
 */
@Configuration
/**
 * <!--开启注解扫描-->
 *     <context:component-scan base-package="com.at.spring5.aopanno"></context:component-scan>
 */
@ComponentScan(basePackages = {"com.at.spring5"})
/**
 * <!--开启Aspect生成代理对象    -->
 *     <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
