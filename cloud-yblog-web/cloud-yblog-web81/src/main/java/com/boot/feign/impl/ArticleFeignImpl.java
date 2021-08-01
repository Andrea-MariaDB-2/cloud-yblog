package com.boot.feign.impl;

import com.boot.data.CommonResult;
import com.boot.feign.ArticleFeign;
import com.boot.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Slf4j
public class ArticleFeignImpl implements ArticleFeign {


    @Override
    public CommonResult<List<Article>> selectAllArticleByPage(int pageNum, int pageSize) {
        log.error("ArticleFeignImpl--selectAllArticleByPage--fallback");
        return null;
    }

    @Override
    public int selectLikeCount(int id) {
        log.error("ArticleFeignImpl--selectLikeCount--fallback");
        return -1;
    }
}
