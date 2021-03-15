package com.kuang.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @author fantaixi
 * @create 2021-01-18 17:00
 */
@Configuration
public class DruidConfig {

    //与配置文件绑定
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    //后台监控
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //后台需要有人登陆，账号密码设置
        HashMap<String,String> map = new HashMap<>();
        //增加配置
        map.put("loginUsername","admin");  //登陆的key是固定的
        map.put("loginPassword","123456");
        //允许谁访问  ""  表示所有人可以访问
        map.put("allow","");
        bean.setInitParameters(map); //设置初始化参数
        return bean;
    }

    //@Bean
    //public ServletRegistrationBean statViewServlet() {
    //    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    //    // 添加IP白名单
    //    servletRegistrationBean.addInitParameter("allow", "192.168.25.125,127.0.0.1");
    //    // 添加IP黑名单，当白名单和黑名单重复时，黑名单优先级更高
    //    servletRegistrationBean.addInitParameter("deny", "192.168.25.123");
    //    // 添加控制台管理用户
    //    servletRegistrationBean.addInitParameter("loginUsername", "druid");
    //    servletRegistrationBean.addInitParameter("loginPassword", "123456");
    //    // 是否能够重置数据
    //    servletRegistrationBean.addInitParameter("resetEnable", "false");
    //    return servletRegistrationBean;
    //}

    /**
     * 配置服务过滤器
     *
     * @return 返回过滤器配置对象
     */
    //@Bean
    //public FilterRegistrationBean statFilter() {
    //    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
    //    // 添加过滤规则
    //    filterRegistrationBean.addUrlPatterns("/*");
    //    // 忽略过滤格式
    //    filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,");
    //    return filterRegistrationBean;
    //}

}
