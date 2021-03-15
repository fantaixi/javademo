package com.at.spring5.service;

import com.at.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fantaixi
 * @create 2021-01-03 4:34
 */
@Service
//放在类上面表示所有方法都添加事务
//两个事务之间的传播行为  propagation = Propagation.REQUIRED （默认） 如果方法本身有事务，调用没有事务的方法时，使用当前方法的事务，如果当前方法没有事务，就新开一个事务
//isolation  设置隔离级别 可重复读 ，可以解决可以解决脏读，不可重复读   mysql默认可重复读
//readOnly  为true只能查询
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = -1,readOnly = false)
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney(){
        //try {
            //1、开启事务

            //2、业务操作
            //多钱
            userDao.addMoney();
            //int i = 10/0;
            //少钱
            userDao.reduceMoney();

            //3、如果没有异常提交事务
        //} catch (Exception e) {
            //4、出现异常，回滚事务
            //e.printStackTrace();
        //}
    }
}
