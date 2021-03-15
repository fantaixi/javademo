package com.at.spring5.bean;

/**
 * @author fantaixi
 * @create 2020-12-29 4:07
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
