package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author fantaixi
 * @create 2021-01-20 2:58
 */
@Repository
@Mapper
public interface UserMapper {
    User queryUserByName(String name);
}
