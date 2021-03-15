package com.at.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author fantaixi
 * @create 2021-01-02 10:55
 */
//增强的类
@Component
@Aspect  //生成代理对象
@Order(30)   //值越小优先级越高
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.at.spring5.aopanno.User.add(..))")
    public void pointdemo(){

    }


    //前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("前置通知before.....");
    }

    //最终通知
    @After(value = "execution(* com.at.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("后置通知after....");
    }

    //后置通知
    @AfterReturning(value = "execution(* com.at.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("方法成功后通知afterReturning....");
    }

    @AfterThrowing(value = "execution(* com.at.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("异常通知afterThrowing....");
    }

    @Around(value = "execution(* com.at.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知around之前....");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知around之后....");
    }
}
