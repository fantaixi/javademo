package com.at.spring5.service;

import com.at.spring5.dao.UserDao;

/**
 * @author fantaixi
 * @create 2020-12-29 3:43
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service  add....");
        userDao.update();
    }
}
