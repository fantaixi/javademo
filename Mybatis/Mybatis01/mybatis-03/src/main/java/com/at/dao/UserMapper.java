package com.at.dao;

import com.at.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author fantaixi
 * @create 2021-01-05 1:06
 */
public interface UserMapper {

    //根据id差用户
    User getUserById(int id);

    //分页
    List<User> getUserByLimit(Map<String, Integer> map);
}
