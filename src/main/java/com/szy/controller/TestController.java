package com.szy.controller;


import com.szy.annotation.SysLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @SysLog
    @RequestMapping("/test")
    public String test(){
        return "测试";
    }


    @SysLog
    @RequestMapping("/exc")
    public int exception(){
        return 1/0;
    }
}
