package com.szy.springboottemplate;

import com.szy.entity.system.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringbootTemplateApplicationTests {

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
}
