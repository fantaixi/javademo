package com.at.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author fantaixi
 * @create 2021-01-02 5:51
 */
public class JDKProxy {
    public static void main(String[] args) {
        //Class[] interfaces={UserDao.class};
        //UserDaoImpl userDaoImpl = new UserDaoImpl();
        //UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        //int aaa = dao.add(1, 3);
        //System.out.println(aaa);

        //或者
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), UserDaoImpl.class.getInterfaces(), new UserDaoProxy(userDaoImpl));
        int aaa = dao.add(1, 3);
        System.out.println(aaa);
    }
}

//创建代理对象
class UserDaoProxy implements InvocationHandler{
    //创建谁的代理对象，就把谁传递过来
    //有参数构造器
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }
    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行...."+method.getName()+":传递的参数..."+ Arrays.toString(args));

        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行...."+obj);
        return res;
    }
}