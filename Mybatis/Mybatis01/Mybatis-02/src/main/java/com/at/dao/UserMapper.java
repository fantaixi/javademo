package com.at.dao;

import com.at.pojo.User;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-05 1:06
 */
public interface UserMapper {
    //查询所有用户
    List<User>  getUserList();

    //根据id差用户
    User getUserById(int id);


    //添加用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

}
