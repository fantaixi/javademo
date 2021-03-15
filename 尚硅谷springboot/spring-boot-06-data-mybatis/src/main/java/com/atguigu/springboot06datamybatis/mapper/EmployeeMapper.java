package com.atguigu.springboot06datamybatis.mapper;

import com.atguigu.springboot06datamybatis.bean.Employee;

/**
 * @author fantaixi
 * @create 2020-10-13 14:52
 */
//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
