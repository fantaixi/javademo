package com.at.spring5.test;

import com.at.spring5.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fantaixi
 * @create 2021-01-03 23:48
 */
//整合j4
@RunWith(SpringJUnit4ClassRunner.class) //指定框架
@ContextConfiguration("classpath:bean1.xml") //加载配置文件
public class JTest4 {
    @Autowired
    private UserService userService;

    @Test
    public void testUser(){
        userService.accountMoney();
    }
}
