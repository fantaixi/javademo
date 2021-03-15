package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fantaixi
 * @create 2021-01-18 20:16
 */
//表示这是一个mybatis的mapper类
@Mapper
//用于将数据访问层 (DAO 层 ) 的类标识为 Spring Bean。具体只需将该注解标注在 DAO类上即可
@Repository
public interface UserMapper {
    //查询所有用户
    List<User> queryUserList();
    //根据id查询
    User selectUserById(int id);
    //增加
    int addUser(User user);
    //修改
    int updateUser(User user);
    //删除
    int deleteUser(int id);
}
