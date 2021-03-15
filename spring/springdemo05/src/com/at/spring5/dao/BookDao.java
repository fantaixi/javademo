package com.at.spring5.dao;

import com.at.spring5.enity.Boys;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-03 1:18
 */
public interface BookDao {
    void add(Boys boys);

    void update(Boys boys);

    void delete(int id);

    int findCounts();

    Boys findInfo(Integer id);

    List<Boys> findAll();

    void batchAdd(List<Object[]> batch);
}
