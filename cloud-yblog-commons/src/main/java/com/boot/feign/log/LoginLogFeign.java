package com.boot.feign.log;

import com.boot.feign.log.impl.LoginLogFeignImpl;
import com.boot.pojo.LoginLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "cloud-yblog-log",fallback = LoginLogFeignImpl.class)
@Component
public interface LoginLogFeign {

    @ResponseBody
    @PostMapping(path = "/feign/loginlog/insertLoginLog")
    public String insertLoginLog(@RequestBody LoginLog loginLog);





}
