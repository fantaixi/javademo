package com.at.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author fantaixi
 * @create 2021-01-02 4:13
 */
@Repository(value = "userDaoIpml1")
public class UserDaoIpml implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add....");
    }
}
