package com.example.bootDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bootDemo.utils.RedisUtil;
import com.example.customerCenter.dao.UserDao;
import com.example.customerCenter.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisUtil redisUtil;
	@Autowired
	private UserDao userDao;
	
    @Test
    public void testObj() throws Exception {
        User user=userDao.findByUserName("aa");
        boolean exists= redisUtil.set("user_aa", user);
        //System.out.println(exists);
        String user_redis = redisUtil.get("user_aa");
        System.out.println(user_redis);
       // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }
}
