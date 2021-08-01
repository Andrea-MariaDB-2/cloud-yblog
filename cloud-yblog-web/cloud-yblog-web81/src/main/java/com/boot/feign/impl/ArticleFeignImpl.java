package com.boot.feign.impl;

import com.boot.data.CommonResult;
import com.boot.feign.ArticleFeign;
import com.boot.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ArticleFeignImpl implements ArticleFeign {


    @Override
    public CommonResult<List<Article>> selectAllArticle() {
        log.error("selectAllArticle====>fallback");

        CommonResult<List<Article>> listCommonResult = new CommonResult<>();

        return listCommonResult;
    }
}
