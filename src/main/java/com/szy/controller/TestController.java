package com.szy.controller;


import com.szy.annotation.SysLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试接口")
@RestController
public class TestController {

    @SysLog
    @GetMapping("/test")
    @Operation(summary = "普通测试")
    public String test(){
        return "测试";
    }


    @SysLog
    @GetMapping("/exc")
    @Operation(summary = "异常测试")
    public int exception(){
        return 1/0;
    }
}
