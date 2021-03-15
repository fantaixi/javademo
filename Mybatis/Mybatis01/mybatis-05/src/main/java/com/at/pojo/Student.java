package com.at.pojo;

import lombok.Data;

/**
 * @author fantaixi
 * @create 2021-01-07 4:19
 */
@Data
public class Student {
    private int id;
    private String name;
    //关联到一个老师
    private Teacher teacher;
}
