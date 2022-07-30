package com.szy.springboottemplate;

import com.alibaba.fastjson.JSON;
import com.szy.entity.SysLog;
import com.szy.entity.system.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Date;

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
        SysLog a = (SysLog) redisTemplate.opsForValue().get("a");
        System.out.println(JSON.toJSONString(a));
    }
}
