package com.kuang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fantaixi
 * @create 2021-01-20 17:58
 */
@Configuration
@EnableSwagger2  //开启swagger2
public class SwaggerConfig {

    //要配置多个分组  实例化Docket即可

    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("依雯");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("依雯2");
    }

    //配置swagger的Docket的Bean实例
    @Bean
    public Docket docket(Environment environment){
        //设置要显示的swagger环境
        Profiles profiles = Profiles.of("dev","test");
        //判断是否处在自己设定的环境中
        boolean b = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //是否启动swagger
                .enable(b)
                //api文档分组
                .groupName("饭太稀")
                .select()
                //RequestHandlerSelectors:配置要扫描的接口
                //basePackage：指定要扫描的包
                //RequestHandlerSelectors.any扫描全部的包
                //none：都不扫描
                //withClassAnnotation:扫描类上的注解:参数是一个注解的反射对象
                //withMethodAnnotation
                .apis(RequestHandlerSelectors.basePackage("com.kuang.controller"))
                //过滤路径
                //.paths(PathSelectors.ant("/kuang/**"))
                .build();
    }

    //配置swagger的信息ApiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("饭太稀", "https://www.google.com", "1013446801@qq.com");
        return new ApiInfo(
                "饭太稀",
                "依雯",
                "v1.0",
                "https://www.google.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0");
    }
}
