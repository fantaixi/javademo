package com.at.dao;

import com.at.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author fantaixi
 * @create 2021-01-07 4:21
 */
public interface TeacherMapper {
    //获取老师
   // List<Teacher> getTeacher();

    //获取指定老师下的所有学生以及老师的信息
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
