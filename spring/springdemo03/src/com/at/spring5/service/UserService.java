package com.at.spring5.service;

import com.at.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @author fantaixi
 * @create 2021-01-02 3:22
 */
//value可以不写，默认值是类首字母小写
//@Component(value = "userService")  //<bean id="userService" class="...."></bean>
//@Repository
//@Controller
@Service
public class UserService {
    //给普通属性注入值
    @Value(value = "aaa")
    private String name;

    //不需要set,根据类型进行注入
    @Autowired
    @Qualifier(value = "userDaoIpml1")  //根据名称进行注入  要和 @Autowired 一起使用
    private UserDao userDao;

    //@Resource(name = "userDaoIpml1")  可以根据名称或类型注入
    //private UserDao userDao;

    public void add(){
        System.out.println("service add..."+name);
        userDao.add();
    }
}
