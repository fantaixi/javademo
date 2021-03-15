package com.kuang.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author fantaixi
 * @create 2021-01-20 0:56
 */
@Configuration
public class ShiroConfig {
    //ShiroFilterFactoryBean   3
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultSecurityManager defaultSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultSecurityManager);

        //添加shiro的内置过滤器
        /**
         anno：无需认证就可以访问
         authc：必须认证才可以访问
         user：必须拥有 记住我 功能才能用
         perms：拥有对某个资源的权限才能访问
         role：拥有某个角色权限才能访问
         */
        //拦截
        Map<String, String> map = new LinkedHashMap<>();
        map.put("/user/add","authc");
        map.put("/user/update","authc");

        //授权
        map.put("/user/add","perms[user:add]");
        map.put("/user/update","perms[user:update]");

        bean.setFilterChainDefinitionMap(map);

        //设置登录的请求
        bean.setLoginUrl("/toLogin");

        //设置未授权页面
        bean.setUnauthorizedUrl("/noauth");
        return bean;
    }

    //DefaultWebSecurityMannge   2
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联UserRealm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    //创建 realm 对象  需要自定义  1
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }

    //整合ShiroDialect：整合shiro和thymeleaf
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
