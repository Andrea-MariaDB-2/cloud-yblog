package com.boot.feign.system.impl;

import com.boot.data.CommonResult;
import com.boot.feign.system.SettingFeign;
import com.boot.pojo.Setting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SettingFeignImpl implements SettingFeign {


    @Override
    public Setting selectUserSetting(String name) {
        log.error("SettingFeignImpl--selectUserSetting--fallback");
        return null;
    }
}
