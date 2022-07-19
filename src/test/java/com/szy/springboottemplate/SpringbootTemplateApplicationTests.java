package com.szy.springboottemplate;

import com.szy.entity.system.ResultData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTemplateApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(ResultData.success(null));
    }

}
