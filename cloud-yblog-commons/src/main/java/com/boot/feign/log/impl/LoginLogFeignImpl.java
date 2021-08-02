package com.boot.feign.log.impl;

import com.boot.feign.log.LoginLogFeign;
import com.boot.pojo.LoginLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginLogFeignImpl implements LoginLogFeign {
    @Override
    public String insertLoginLog(LoginLog loginLog) {
        log.error("LoginLogFeignImpl---insertLoginLog--fallback");
        return null;
    }
}
