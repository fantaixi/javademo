package com.kuang.config;

import com.kuang.pojo.User;
import com.kuang.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author fantaixi
 * @create 2021-01-20 1:08
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权。。。。。。");
        //SimpleAuthorizationInfo
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //给所有请求添加权限  user:add
        info.addStringPermission("user:add");

        //拿到当前登录的对象
        Subject subject = SecurityUtils.getSubject();
        //principal 是认证里面的user
        User currentUser = (User) subject.getPrincipal();

        //设置当前用户的权限
        info.addStringPermission(currentUser.getPerms());
        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行了认证。。。。。。");

        UsernamePasswordToken userToken = (UsernamePasswordToken) token;

        //if (!userToken.getUsername().equals(name)){
        //    System.out.println("111111111111111");
        //    return null; //抛出一个异常：UnknownAccountException
        //}

        //用户名，密码，从数据库去
        User user = userService.queryUserByName(userToken.getUsername());
        if (user == null){
            return null;
        }

        //密码认证shiro做，防止泄露
        return new SimpleAuthenticationInfo(user,user.getPwd(),"");
    }
}
