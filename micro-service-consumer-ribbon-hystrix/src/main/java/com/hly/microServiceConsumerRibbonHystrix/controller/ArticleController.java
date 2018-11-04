package com.hly.microServiceConsumerRibbonHystrix.controller;


import com.hly.microServiceConsumerRibbonHystrix.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/10/29
 */
@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("/article")
    public String article() {

        return articleService.article();
    }
    @RequestMapping("/article/{id}/deletion")
    public String delete(@PathVariable("id")int id) {

        return articleService.delete(id);
    }
    @RequestMapping("/articleDetail")
    public String articleDetail() {

        return articleService.articleDetail();
    }

}
