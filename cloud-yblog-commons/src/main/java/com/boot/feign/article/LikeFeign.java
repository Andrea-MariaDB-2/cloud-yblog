package com.boot.feign.article;

import com.boot.feign.article.impl.LikeFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient(value = "cloud-yblog-article",fallback = LikeFeignImpl.class)
public interface LikeFeign {

    @ResponseBody
    @GetMapping(path = "/feign/like/selectLikeExsit")
    public String selectLikeExsit(@RequestParam("username") String username,
                                  @RequestParam("articleid") int articleid);


}
