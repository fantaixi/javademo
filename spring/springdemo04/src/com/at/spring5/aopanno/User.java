package com.at.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author fantaixi
 * @create 2021-01-02 10:55
 */
//被增强的类
@Component
public class User {
    public void add(){
        System.out.println("add....");
    }
}
