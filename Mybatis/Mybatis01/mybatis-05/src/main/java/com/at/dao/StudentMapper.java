package com.at.dao;

import com.at.pojo.Student;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-07 4:21
 */
public interface StudentMapper {

    //查询所有学生以及对应的老师信息
    List<Student> getStudentList();

    //按照结果嵌套处理
    List<Student> getStudentList2();
}
