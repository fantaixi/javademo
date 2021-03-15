package com.at.spring5.test;

import com.at.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * @author fantaixi
 * @create 2021-01-03 1:41
 */
public class testJDBC {
    @Test
    public void testadd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //Boys boys = new Boys();
        //boys.setId(111);
        //boys.setBoyName("帅哥");
        //boys.setUserCP(99999);
        //bookService.add(boys);

        //Boys boys = new Boys();
        //boys.setId(111);
        //boys.setBoyName("真的假的");
        //boys.setUserCP(99999);
        //bookService.update(boys);

        //bookService.delete(99);

        //查询条数
        //int counts = bookService.findCounts();
        //System.out.println(counts);

        //查询具体信息
        //Boys info = bookService.findInfo(1);
        //System.out.println(info);

        //返回集合
        //List<Boys> all = bookService.findAll();
        //for (Boys b : all) {
        //    System.out.println(b);
        //}

        //批量添加
        ArrayList<Object[]> objects = new ArrayList<>();
        Object[] o1={"111","222","333"};
        Object[] o2={"112","222","333"};
        Object[] o3={"113","222","333"};
        objects.add(o1);
        objects.add(o2);
        objects.add(o3);
        bookService.batchAdd(objects);
    }
}
