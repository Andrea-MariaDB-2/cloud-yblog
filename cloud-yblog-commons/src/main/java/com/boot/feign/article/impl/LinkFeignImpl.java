package com.boot.feign.article.impl;

import com.boot.data.CommonResult;
import com.boot.feign.article.LinkFeign;
import com.boot.pojo.Link;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class LinkFeignImpl implements LinkFeign {
    @Override
    public List<Link> selectAllLink() {
        log.error("LinkFeignImpl----selectAllLink--fallback");
        return null;
    }
}
