package com.at.dao;

import com.at.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author fantaixi
 * @create 2021-01-08 4:11
 */
public interface UserMapper {

    User queryUserById(@Param("id") int id);
}
