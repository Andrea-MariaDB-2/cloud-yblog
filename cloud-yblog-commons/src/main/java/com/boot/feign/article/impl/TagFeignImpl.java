package com.boot.feign.article.impl;

import com.boot.data.CommonResult;
import com.boot.feign.article.TagFeign;
import com.boot.pojo.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class TagFeignImpl implements TagFeign {
    @Override
    public List<Tag> selectTagsByLimit8() {
        log.error("TagFeignImpl---selectTagsByLimit8---fallback");
        return null;
    }
}
