package com.cike.redisson;

import org.redisson.Redisson;
import org.redisson.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Author Kou
 * @Date 2020/9/15
 * @Version 1.0
 **/
@SpringBootApplication
public class RedissonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedissonApplication.class,args);
    }

    @Bean
    public Redisson redisson(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379").setDatabase(0);
        return (Redisson) Redisson.create(config);
    }
}

