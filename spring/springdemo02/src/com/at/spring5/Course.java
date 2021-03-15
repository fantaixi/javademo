package com.at.spring5;

/**
 * @author fantaixi
 * @create 2020-12-29 9:56
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
