package com.szy.entity;

import lombok.Data;

@Data
public class ControllerLog {

    // 方法名
    private String method;

    // 方法参数
    private String params;

    // 客户端IP地址
    private String ip;

    // 请求方式
    private String requestMethod;

    // 请求地址
    private String requestUrl;

    // 请求者
    private String requestUser;

    // 请求是否发生异常
    private Boolean status;

    // 异常信息
    private String errMsg;

    // 返回值
    private String data;

}
