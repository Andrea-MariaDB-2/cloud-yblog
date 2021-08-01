package com.boot.controller;

import com.boot.annotation.Visitor;
import com.boot.constant.ThemeConstant;
import com.boot.data.CommonResult;
import com.boot.feign.ArticleFeign;
import com.boot.feign.SettingFeign;
import com.boot.pojo.*;
import com.boot.utils.Commons;
import com.boot.utils.SpringSecurityUtil;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

    @Resource
    private SettingFeign settingFeign;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private SpringSecurityUtil securityUtil;


    private void setting(HttpSession session,ModelAndView modelAndView){
        SecurityContextImpl securityContext = (SecurityContextImpl) session.getAttribute("SPRING_SECURITY_CONTEXT");
        if (securityContext != null) {
            String name = securityUtil.currentUser(session);
            CommonResult<Setting> setting = settingFeign.selectUserSetting(name);
            modelAndView.addObject("setting",setting.getData());
        }else {
            modelAndView.addObject("setting",null);
        }

    }



    @Visitor(desc = "访问首页")
    @RequestMapping(path = {"/"})
    public ModelAndView toIndex1(HttpSession session, HttpServletRequest request, HttpServletResponse response) {


        ModelAndView modelAndView = new ModelAndView();

//        System.out.println("测试负载均衡==当前端口是："+port);

        //传setting给前端
        this.setting(session,modelAndView);

        modelAndView.addObject("articleFeign",articleFeign);
        modelAndView.addObject("likeService",likeService);
        SecurityContextImpl securityContext = (SecurityContextImpl) session.getAttribute("SPRING_SECURITY_CONTEXT");
        if (securityContext != null) {
            String name = securityUtil.currentUser(session);
            if (name != null && !name.equals("")) {
                modelAndView.addObject("user",name);
            }
        } else {
            modelAndView.addObject("user",null);
        }

        //跳转不同页面主题判断
        if (ThemeConstant.curTheme.equals(ThemeConstant.CALM_THEME)) { //calm主题
            modelAndView.setViewName("client/index2"); //跳转页面
            List<Tag> tags = tagService.selectTags_limit8();
            modelAndView.addObject("indexAc", "active");
            modelAndView.addObject("tags", tags);

        } else if (ThemeConstant.curTheme.equals(ThemeConstant.DEFAULT_THEME)) { //默认主题
            modelAndView.setViewName("client/index"); //跳转页面

        }


        CommonResult<List<Article>> articleByPage = articleFeign.selectAllArticleByPage(1, 8);
        PageInfo pageInfo = new PageInfo(articleByPage.getData());


        List<Article> as = (List<Article>) redisTemplate.opsForValue().get("articleOrders10");
        if (as == null) {
            List<Article> articleOrders = ArticleOrder_10(articleService.selectAllArticleOrderByDesc());
            redisTemplate.opsForValue().set("articleOrders10", articleOrders, 60 * 1, TimeUnit.SECONDS);
            modelAndView.addObject("articleOrders", articleOrders);
        } else {
            modelAndView.addObject("articleOrders", as);
        }

        /**
         * xxx个人博客标题
         */
        this.queryUserDeail(session, modelAndView);


        //友链
        List<Link> Links = linkService.selectAllLink();
        modelAndView.addObject("links", Links);

        //推荐文章
        PageHelper.startPage(1,5);
        List<Article> recommends = articleService.selectArticleByRecommend();
        modelAndView.addObject("recommends",recommends);

        modelAndView.addObject("articles", list);
        modelAndView.addObject("commons", Commons.getInstance());
        modelAndView.addObject("pageInfo", pageInfo);

        return modelAndView;
    }


}
