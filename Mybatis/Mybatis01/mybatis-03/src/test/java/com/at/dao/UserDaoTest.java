package com.at.dao;

import com.at.pojo.User;
import com.at.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-05 1:23
 */
public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test(){
        //获取SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(4);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testlog4j(){
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> user = mapper.getUserByLimit(map);
        for (User user1 : user) {
            System.out.println(user1);
        }
        sqlSession.close();
    }
}
