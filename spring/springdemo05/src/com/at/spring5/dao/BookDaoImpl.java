package com.at.spring5.dao;

import com.at.spring5.enity.Boys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-03 1:19
 */
@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Boys boys) {
        //创建sql
        String sql = "insert into boys values(?,?,?)";
        //调用方法实现
        Object[] obj = {boys.getId(), boys.getBoyName(),boys.getUserCP()};
        int i = jdbcTemplate.update(sql, obj);
        System.out.println(i);
    }

    @Override
    public void update(Boys boys) {
        //创建sql
        String sql = "update boys set boyName=?,userCP=? where id=?";
        //调用方法实现
        Object[] obj = { boys.getBoyName(),boys.getUserCP(),boys.getId()};
        int i = jdbcTemplate.update(sql, obj);
        System.out.println(i);
    }

    @Override
    public void delete(int id) {
        //创建sql
        String sql = "delete from boys  where id=?";
        //调用方法实现
        int i = jdbcTemplate.update(sql, id);
        System.out.println(i);
    }

    @Override
    public int findCounts() {
        String sql = "select count(*) from boys";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public Boys findInfo(Integer id) {
        String sql = "select * from boys where id=?";
        Boys boys = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Boys>(Boys.class), id);
        return boys;
    }

    @Override
    public List<Boys> findAll() {
        String sql = "select * from boys ";
        List<Boys> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Boys>(Boys.class));
        return query;
    }

    @Override
    public void batchAdd(List<Object[]> batch) {
        String sql = "insert into boys values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batch);
        System.out.println(Arrays.toString(ints));
    }
}
