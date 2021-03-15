package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-11 9:27
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除
    int deleteBookById(@Param("bookId") int id);

    //更新
    int updateBook(Books books);

    //根据id查询
    Books queryBookById(@Param("bookId") int id);

    //查询全部
    List<Books> queryAllBook();
}
