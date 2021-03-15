package com.kuang.service;

import com.kuang.pojo.Books;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-11 9:50
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除
    int deleteBookById(int id);

    //更新
    int updateBook(Books books);

    //根据id查询
    Books queryBookById( int id);

    //查询全部
    List<Books> queryAllBook();
}
