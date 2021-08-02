package com.boot.feign.user;

import com.boot.data.CommonResult;
import com.boot.feign.user.impl.UserDetailFeignImpl;
import com.boot.pojo.UserDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient(value = "cloud-yblog-user",fallback = UserDetailFeignImpl.class)
public interface UserDetailFeign {

    @ResponseBody
    @GetMapping(path = "/feign/userdetail/selectUserDetailByUserName")
    public UserDetail selectUserDetailByUserName(@RequestParam("name") String name);







}
