package com.boot.feign.article;

import com.boot.data.CommonResult;
import com.boot.feign.article.impl.ArticleFeignImpl;
import com.boot.pojo.Article;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Component
@FeignClient(value = "cloud-yblog-article",fallback = ArticleFeignImpl.class)
public interface ArticleFeign {


    @ResponseBody
    @GetMapping(path = "/feign/article/selectAllArticle")
    public Map<String,Object> selectAllArticleByPage(@RequestParam("pageNum") int pageNum,
                                                     @RequestParam("pageSize") int pageSize);

    @ResponseBody
    @GetMapping(path = "/feign/article/selectLikeCount")
    public int selectLikeCount(@RequestParam("id") int id);

    @ResponseBody
    @GetMapping(path = "/feign/article/selectAllArticleOrderByDesc")
    public List<Article> selectAllArticleOrderByDesc();


    @ResponseBody
    @GetMapping(path = "/feign/article/selectArticleByRecommendPage")
    public List<Article> selectArticleByRecommendPage(@RequestParam("pageNum") int pageNum,
                                                      @RequestParam("pageSize") int pageSize);

    @ResponseBody
    @GetMapping(path = "/feign/article/updateHits")
    public String updateHits(@RequestParam("id") int id);


    @ResponseBody
    @GetMapping(path = "/feign/article/selectArticleByArticleIdNoComment")
    public Article selectArticleByArticleIdNoComment(@RequestParam("id") int id);



    }
