package com.boot.controller;

import com.boot.annotation.Visitor;
import com.boot.constant.themeConstant;
import com.boot.data.CommonResult;
import com.boot.data.ResponseData.ArticleResponseData;
import com.boot.feign.ArticleFeign;
import com.boot.pojo.*;
import com.boot.utils.Commons;
import com.boot.utils.SpringSecurityUtil;
import com.boot.utils.ipUtils;
import com.google.common.util.concurrent.RateLimiter;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 游政杰
 * 2021/5/20 17:08
 */
@Controller
@Api("客户端界面控制器")
public class ClientController {

    @Resource
    private ArticleFeign articleFeign;

    @Autowired
    private SpringSecurityUtil springSecurityUtil;


    @ResponseBody
    @GetMapping(path = "/test001")
    public List<Article> test(HttpSession session){
        System.out.println(springSecurityUtil);

        CommonResult<List<Article>> listCommonResult = articleFeign.selectAllArticle();

        List<Article> data = listCommonResult.getData();

        return data;
    }



}
