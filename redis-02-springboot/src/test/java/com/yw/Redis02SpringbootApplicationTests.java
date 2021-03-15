package com.yw;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yw.pojo.User;
import com.yw.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis02SpringbootApplicationTests {
    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Test
    void contextLoads() {

        //opsForValue  操作字符串  类似string
        //opsForList  操作List  类似List
        redisTemplate.opsForValue().set("k1","v1");
        System.out.println(redisTemplate.opsForValue().get("k1"));

        //获取连接
        //RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        //connection.flushDb();
        //connection.flushAll();
    }

    @Test
    public void test1() throws JsonProcessingException {
        User user = new User("依雯", 3);
        //String jsonUser = new ObjectMapper().writeValueAsString(user);

        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

    @Test
    public void test2(){
        redisUtils.set("name","依雯");
        System.out.println(redisUtils.get("name"));
    }
}
