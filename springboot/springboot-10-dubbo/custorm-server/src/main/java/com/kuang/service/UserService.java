package com.kuang.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author fantaixi
 * @create 2021-01-21 16:06
 */
@Service  //导入的是spring的包
public class UserService {
    //拿到票,去注册中心拿到服务
    @Reference  //引用，pom坐标，可以定义路径相同的接口名
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("拿到"+ticket);
    }

}
