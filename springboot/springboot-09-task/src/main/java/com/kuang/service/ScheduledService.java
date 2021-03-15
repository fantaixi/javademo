package com.kuang.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author fantaixi
 * @create 2021-01-21 1:17
 */
@Service
public class ScheduledService {

    //特定的时间执行
    // cron 表达式
    //秒  分  时  日 月 周几（0-7表示每一天）

    /*
        0 28 1 * * ?  每一天的1:28执行一次
        0 0/5 10,18 * * ?  每一天的10点和18点，间隔五分钟执行一次
        0 28 1 ? * 1-6  每个月的周一到周六，1:28执行一次
     */
    @Scheduled(cron = "0 28 1 * * ?")
    public void hello(){
        System.out.println("你被执行了。。。。");
    }
}
