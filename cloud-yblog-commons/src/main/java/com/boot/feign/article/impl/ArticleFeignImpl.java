package com.boot.feign.article.impl;

import com.boot.data.CommonResult;
import com.boot.feign.article.ArticleFeign;
import com.boot.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ArticleFeignImpl implements ArticleFeign {


    @Override
    public List<Article> selectAllArticleByPage(int pageNum, int pageSize) {
        log.error("ArticleFeignImpl--selectAllArticleByPage--fallback");
        return null;
    }

    @Override
    public int selectLikeCount(int id) {
        log.error("ArticleFeignImpl--selectLikeCount--fallback");
        return 0;
    }

    @Override
    public List<Article> selectAllArticleOrderByDesc() {
        log.error("ArticleFeignImpl---selectAllArticleOrderByDesc---fallback");
        return null;
    }

    @Override
    public List<Article> selectArticleByRecommendPage(int pageNum, int pageSize) {
        log.error("ArticleFeignImpl---selectArticleByRecommendPage---fallback");
        return null;
    }

    @Override
    public String updateHits(int id) {
        log.error("ArticleFeignImpl---updateHits--fallback");
        return null;
    }

    @Override
    public Article selectArticleByArticleIdNoComment(int id) {
        log.error("ArticleFeignImpl---selectArticleByArticleIdNoComment---fallback");
        return null;
    }
}
