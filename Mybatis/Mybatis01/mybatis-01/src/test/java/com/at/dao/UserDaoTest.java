package com.at.dao;

import com.at.pojo.User;
import com.at.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void test2(){
        //获取SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser(new User(4, "帅哥", "123456"));
        if (i>0){
            System.out.println("成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser(new User(4, "依雯", "14586"));
        if (i >0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        if (i >0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    //map 测试
    @Test
    public void test6(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userID",10);
        map.put("userName","999");
        map.put("password",666);
        int i = mapper.addUser2(map);
        if (i > 0){
            System.out.println("map成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test7(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userID",4);
        map.put("userName","依雯");
        User user = mapper.getUserById2(map);
        System.out.println(user);
        sqlSession.close();
    }

    //模糊查询
    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUserLike("依");
        for (User u:users ) {
            System.out.println(u);
        }
        sqlSession.close();
    }
}
