package com.hly.microServiceConsumerRibbonHystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/4
 */
@Service
public class MainService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "pageError")
    public String root() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/index",String.class);
    }

    @HystrixCommand(fallbackMethod = "pageError")
    public String index() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/index",String.class);
    }

    @HystrixCommand(fallbackMethod = "pageError")
    public String login() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/login",String.class);
    }

    @HystrixCommand(fallbackMethod = "pageError")
    public String loginError() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/login-error",String.class);
    }

    @HystrixCommand(fallbackMethod = "pageError")
    public String admin() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/admin",String.class);
    }

    @HystrixCommand(fallbackMethod = "pageError")
    public String error401() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/401",String.class);
    }

    @HystrixCommand(fallbackMethod = "pageError")
    public String logout() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/logout",String.class);
    }


    /**
     * 启动两个服务，关闭一个，只能访问另一个，两个都关闭，将输出以下语句
     * @return
     */
    public String pageError(){
        return "sorry,this page error";
    }

}
