package com.java;

import org.junit.Test;

/**
 * @author fantaixi
 * @create 2020-12-19 3:47
 */
public class ClassTest {
    @Test
    public void test1(){
        Person p = new Person("Tom",12);
        p.age=100;
        System.out.println(p.toString());
        p.show();
    }
}
