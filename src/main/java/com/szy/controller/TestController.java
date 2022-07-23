package com.szy.controller;


import com.szy.annotation.WebLog;
import com.szy.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试接口")
@RestController
// 从那nacos获取配置文件
@RefreshScope
public class TestController {

    @DubboReference
    TestService testService;

    @Value("${myConfig}")
    private String myConfig;

    @WebLog
    @GetMapping("/test")
    @Operation(summary = "普通测试")
    public String test(){
        return "测试";
    }


    @WebLog
    @GetMapping("/exc")
    @Operation(summary = "异常测试")
    public int exception(){
        return 1/0;
    }


    @GetMapping("/nac")
    @Operation(summary = "nacos配置测试")
    public String nacos(){
        return myConfig;
    }


    @GetMapping("/dub")
    @Operation(summary = "nacos配置测试")
    public String dubbo(){
        return testService.print("spring-template");
    }

}
