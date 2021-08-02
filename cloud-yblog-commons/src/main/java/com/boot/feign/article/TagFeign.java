package com.boot.feign.article;

import com.boot.data.CommonResult;
import com.boot.feign.article.impl.TagFeignImpl;
import com.boot.pojo.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@FeignClient(value = "cloud-yblog-article",fallback = TagFeignImpl.class)
public interface TagFeign {


    @ResponseBody
    @GetMapping(path = "/feign/tag/selectTagsByLimit8")
    public List<Tag> selectTagsByLimit8();

}
