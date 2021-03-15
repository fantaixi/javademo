package com.at.dao;

import com.at.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author fantaixi
 * @create 2021-01-05 1:23
 */
public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //List<User> users = mapper.getUsers();
        //for (User user : users) {
        //    System.out.println(user);
        //}

        //User user  = mapper.getUserById(1);
        //System.out.println(user);

        //int i = mapper.addUser(new User(18, "林", "aaa"));
        //if (i > 0){
        //    System.out.println("插入成功");
        //}

        mapper.deleteUser(10);
        sqlSession.close();
    }
}
