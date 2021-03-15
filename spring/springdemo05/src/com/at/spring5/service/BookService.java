package com.at.spring5.service;

import com.at.spring5.dao.BookDao;
import com.at.spring5.enity.Boys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-03 1:18
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    public void add(Boys boys){
        bookDao.add(boys);
    }

    public void update(Boys boys){
        bookDao.update(boys);
    }

    public void delete(int id){
        bookDao.delete(id);
    }

    //查询条数
    public int findCounts(){
        return bookDao.findCounts();
    }

    //查询具体对象
    public Boys findInfo(Integer id){
        return bookDao.findInfo(id);
    }

    //返回查询集合
    public List<Boys> findAll(){
        return bookDao.findAll();
    }

    //批量添加
    public void batchAdd(List<Object[]> batch){
        bookDao.batchAdd(batch);
    }
}
