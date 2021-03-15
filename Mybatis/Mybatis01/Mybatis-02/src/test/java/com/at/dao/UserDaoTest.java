package com.at.dao;

import com.at.pojo.User;
import com.at.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-05 1:23
 */
public class UserDaoTest {
    @Test
    public void test(){
        //获取SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User u : userList) {
            System.out.println(u);
        }
        sqlSession.close();
    }


}
