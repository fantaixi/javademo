package com.at.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-07 4:18
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
