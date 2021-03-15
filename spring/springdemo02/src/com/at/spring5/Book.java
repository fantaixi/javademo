package com.at.spring5;

import java.util.List;

/**
 * @author fantaixi
 * @create 2020-12-29 10:13
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
