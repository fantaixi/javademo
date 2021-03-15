package com.at.dao;

import com.at.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author fantaixi
 * @create 2021-01-05 1:06
 */
public interface UserMapper {
    //查询所有用户
    List<User>  getUserList();

    //根据id差用户
    User getUserById(int id);

    //用map取用户
    User getUserById2(Map<String, Object> map);

    //添加用户
    int addUser(User user);

    //万能的Map
    int addUser2(Map<String, Object> map);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

    //模糊查询
    List<User> getUserLike(String value);
}
