package com.at.spring5.TestDemo;

import com.at.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fantaixi
 * @create 2020-12-29 4:18
 */
public class TestDao {
    @Test
    public void testBean(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
