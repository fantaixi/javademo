package com.atguigu.springboot06datamybatis.mapper;

import com.atguigu.springboot06datamybatis.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author fantaixi
 * @create 2020-10-13 14:04
 */
@Mapper //指定这是一个操作数据库的mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    Department getDeptById(Integer id);

    @Delete("delet from department where id=#{id}")
    int deletDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
