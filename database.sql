-- 创建日志表
create table sys_log
(
    id             bigint auto_increment comment 'id主键'
        primary key,
    method         varchar(50)   null comment '调用的方法',
    ip             varchar(20)   null comment '请求者的IP',
    requestUrl     varchar(80)   null comment '请求的url',
    params         varchar(100)  null comment '请求参数',
    request_method varchar(10)   null comment '请求方式（GET、POST...)',
    request_user   varchar(50)   null comment '请求者',
    status         tinyint(1)    null comment '过程是否发生异常',
    err_msg        varchar(200)  null comment '错误信息',
    data           varchar(1000) null comment '方法返回值'
)
    comment '请求日志表';

