package com.at.dao;

import com.at.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author fantaixi
 * @create 2021-01-07 9:01
 */
public interface BlogMapper {
    Blog getBlog();

    //根据条件查询
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    //查询1-2-3的博客
    List<Blog> queryBlogForeach(Map map);
}
