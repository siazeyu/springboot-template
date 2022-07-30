package com.szy.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.szy.entity.SysLog;
import com.szy.mapper.SysLogMapper;
import com.szy.service.ISysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 请求日志表 服务实现类
 * </p>
 *
 * @author Siaze
 * @since 2022-07-13
 */
@Service
@DS("db1")
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
