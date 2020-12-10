package com.cike.lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author Kou
 * @Date 2020/12/4
 * @Version 1.0
 **/
@Component
public class RedisLock {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public Boolean deductStock() {
        String lockKey = "product_101";
        try {
            Boolean result = stringRedisTemplate.opsForValue().setIfAbsent(lockKey, "value", 10, TimeUnit.SECONDS);
            return result;
        } finally {
            stringRedisTemplate.delete(lockKey);
        }
    }
}
