package com.at.demoreator8.reactor8;

import java.util.Observable;

/**
 * @author fantaixi
 * @create 2021-01-04 2:31
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        //添加观察者
        observer.addObserver((o,arg) -> {
            System.out.println("发生变化...");
        });

        observer.addObserver((o,arg) -> {
            System.out.println("收到被观察者通知，准备改变...");
        });
        observer.setChanged(); //监测到数据变化
        observer.notifyObservers(); //通知
    }
}
