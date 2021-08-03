package com.boot.feign.article;

import com.boot.feign.article.impl.ArchiveFeignImpl;
import com.boot.pojo.Archive;
import com.boot.pojo.Article;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@FeignClient(value = "cloud-yblog-article",fallback = ArchiveFeignImpl.class)
public interface ArchiveFeign {

    @ResponseBody
    @GetMapping(path = "/feign/archive/selectAllArchiveGroup")
    public List<Archive> selectAllArchiveGroup();

    @ResponseBody
    @GetMapping(path = "/feign/archive/selectArticleByarchiveTime")
    public List<Article> selectArticleByarchiveTime(@RequestParam("date") String date);

}
