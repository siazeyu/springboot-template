package com.szy.springboottemplate;

import com.szy.entity.system.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@Slf4j
@SpringBootTest
class SpringbootTemplateApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        System.out.println(ResultData.success(null));
    }

    @Test
    void log(){
        if (log.isDebugEnabled()){
            log.debug("debug");
        }

        log.info("info");
    }

    @Test
    void redis(){
        redisTemplate.opsForValue().set("a","Adasf");
        System.out.println(redisTemplate.opsForValue().get("a"));
    }
}
