package com.boot.feign.article.impl;

import com.boot.feign.article.ArchiveFeign;
import com.boot.pojo.Archive;
import com.boot.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ArchiveFeignImpl implements ArchiveFeign {


    @Override
    public List<Archive> selectAllArchiveGroup() {
        log.error("ArchiveFeignImpl---selectAllArchiveGroup--fallback");
        return null;
    }

    @Override
    public List<Article> selectArticleByarchiveTime(String date) {
        log.error("ArchiveFeignImpl---selectArticleByarchiveTime--fallback");
        return null;
    }
}
