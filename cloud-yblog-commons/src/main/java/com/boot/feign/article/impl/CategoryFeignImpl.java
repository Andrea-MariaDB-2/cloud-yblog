package com.boot.feign.article.impl;

import com.boot.feign.article.CategoryFeign;
import com.boot.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@Slf4j
public class CategoryFeignImpl implements CategoryFeign {


    @Override
    public List<String> selectCategoryName() {
        log.error("CategoryFeignImpl---selectCategoryName---fallback");
        return null;
    }

    @Override
    public List<Article> queryArticleByCategoryName(@RequestParam("categoryName")String categoryName) {
        log.error("CategoryFeignImpl---CategoryData---fallback");
        return null;
    }
}
