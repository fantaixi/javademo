package com.at.spring5;

/**
 * @author fantaixi
 * @create 2020-12-29 2:27
 */
public class Order {
    private String name;
    private String id;

    public Order(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
