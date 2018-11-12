package com.hly.ribbonService.controller;

import com.hly.ribbonService.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :hly
 * @github :github.com/SiriusHly
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/10/16
 */

@RestController
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping(value = "/blog")
    public String blogService() {
        return blogService.blogService();
    }
}