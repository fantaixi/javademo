package com.at.spring5.aopanno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author fantaixi
 * @create 2021-01-02 23:06
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    //最终通知
    @After(value = "execution(* com.at.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("Person....");
    }
}
