package com.boot.feign.article.impl;

import com.boot.feign.article.LikeFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LikeFeignImpl implements LikeFeign {
    @Override
    public String selectLikeExsit(String username, int articleid) {
//        log.error("LikeFeignImpl---selectLikeExsit--fallback");
        return null;
    }
}
