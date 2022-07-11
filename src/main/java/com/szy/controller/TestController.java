package com.szy.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "测试";
    }

    @RequestMapping("/exc")
    public int exception(){
        return 1/0;
    }
}
