package com.kuang.service;

import com.kuang.pojo.User;

/**
 * @author fantaixi
 * @create 2021-01-20 3:02
 */
public interface UserService {
    User queryUserByName(String name);
}
