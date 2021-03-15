package com.ww;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

//事务测试
public class TestTX {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.flushDB();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","world");
        jsonObject.put("yi","wen");
        //开启事务
        Transaction multi = jedis.multi();
        String s = jsonObject.toJSONString();
        //jedis.watch(s);
        try {
            multi.set("user1",s);
            multi.set("user2",s);
            //int i = 1/0;  //代码抛出异常，事务执行失败
            multi.exec();
        } catch (Exception e) {
            //放弃事务
            multi.discard();
            e.printStackTrace();
        } finally {

            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            //关闭连接
            jedis.close();
        }
    }
}
