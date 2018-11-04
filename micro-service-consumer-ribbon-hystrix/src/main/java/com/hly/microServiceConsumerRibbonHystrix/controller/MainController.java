package com.hly.microServiceConsumerRibbonHystrix.controller;

import com.hly.microServiceConsumerRibbonHystrix.service.MainService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/10/29
 */
@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @RequestMapping("/")
    public String root() {

        return mainService.root();
    }
    @RequestMapping("/index")
    public String index() {

        return mainService.index();
    }
    @RequestMapping("/login")
    public String login() {

        return mainService.login();
    }
    @RequestMapping("/login-error")
    public String loginError() {

        return mainService.loginError();
    }
    @RequestMapping("/admin")
    public String admin() {

        return mainService.admin();
    }
    @RequestMapping("/401")
    public String error401() {

        return mainService.error401();
    }
    @RequestMapping("/logout")
    public String logout() {

        return mainService.logout();
    }


}
