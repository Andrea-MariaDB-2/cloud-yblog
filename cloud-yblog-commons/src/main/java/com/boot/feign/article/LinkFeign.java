package com.boot.feign.article;

import com.boot.data.CommonResult;
import com.boot.feign.article.impl.LinkFeignImpl;
import com.boot.pojo.Link;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@FeignClient(value = "cloud-yblog-article",fallback = LinkFeignImpl.class)
public interface LinkFeign {

    @ResponseBody
    @GetMapping(path = "/feign/link/selectAllLink")
    public List<Link> selectAllLink();

}
