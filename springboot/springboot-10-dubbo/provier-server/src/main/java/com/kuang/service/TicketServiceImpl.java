package com.kuang.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//服务注册与发现

@Service  //可以被扫描到，项目一启动就会被自动注册到注册中心，导入的是dubbo的包
@Component //使用Dubbo后尽量不要用Service注解
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "依雯";
    }
}
