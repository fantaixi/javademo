package com.at.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author fantaixi
 * @create 2021-01-03 4:35
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addMoney() {
        String sql = "update account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"yiwen");
    }

    @Override
    public void reduceMoney() {
        String sql = "update account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lin");
    }
}
