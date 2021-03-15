package com.线程创建;

import org.junit.Test;

/**
 * @author fantaixi
 * @create 2020-12-26 23:45
 */
public class Main {
    @Test
    public void test1(){
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"...");
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+" ");
        }
    }
}