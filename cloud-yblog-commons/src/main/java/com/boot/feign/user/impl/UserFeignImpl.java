package com.boot.feign.user.impl;

import com.boot.data.CommonResult;
import com.boot.feign.user.UserFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserFeignImpl implements UserFeign {
    @Override
    public String selectPasswordByuserName(String name) {
        log.error("UserFeignImpl---selectPasswordByuserName--fallback");
        return null;
    }
}
