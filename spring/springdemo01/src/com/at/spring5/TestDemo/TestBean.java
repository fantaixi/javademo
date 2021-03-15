package com.at.spring5.TestDemo;

import com.at.spring5.bean.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fantaixi
 * @create 2020-12-29 3:58
 */
public class TestBean {
    @Test
    public void testBean(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean4.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
