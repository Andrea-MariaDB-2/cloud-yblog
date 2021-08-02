package com.boot.feign.user;

import com.boot.data.CommonResult;
import com.boot.feign.user.impl.UserFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Component
@FeignClient(value = "cloud-yblog-user",fallback = UserFeignImpl.class)
public interface UserFeign {

    @GetMapping(path = "/feign/userdetail/selectPasswordByuserName")
    public String selectPasswordByuserName(@RequestParam("name") String name);

}
