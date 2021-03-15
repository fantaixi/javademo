package com.ww;

import redis.clients.jedis.Jedis;

/**
 * @author fantaixi
 * @create 2021-02-22 16:37
 */
public class TestPing {
    public static void main(String[] args) {
        //获取Jedis对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //jedis  所有的方法就是之前学习的所有指令
        System.out.println(jedis.ping());
    }
}
