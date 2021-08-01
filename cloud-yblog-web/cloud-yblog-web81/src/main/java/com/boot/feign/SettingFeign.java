package com.boot.feign;

import com.boot.data.CommonResult;
import com.boot.feign.impl.SettingFeignImpl;
import com.boot.pojo.Setting;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "cloud-yblog-system",fallback = SettingFeignImpl.class)
public interface SettingFeign {

    @ResponseBody
    @GetMapping(path = "/feign/setting/selectUserSetting")
    public CommonResult<Setting> selectUserSetting(@RequestParam(value = "name",required = true) String name);



}
