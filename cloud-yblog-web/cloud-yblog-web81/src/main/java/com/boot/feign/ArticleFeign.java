package com.boot.feign;

import com.boot.data.CommonResult;
import com.boot.feign.impl.ArticleFeignImpl;
import com.boot.pojo.Article;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(value = "cloud-yblog-article")
public interface ArticleFeign {


    @ResponseBody
    @GetMapping(path = "/article/selectAllArticle")
    public CommonResult<List<Article>> selectAllArticle();





}
