package com.atguigu.springboot.repository;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fantaixi
 * @create 2020-10-13 15:47
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
