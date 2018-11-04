package com.hly.microServiceConsumerRibbonHystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/4
 */
@Service
public class ArticleService {


    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "pageError")
    public String article() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/article",String.class);
    }

    @HystrixCommand(fallbackMethod = "pageError")
    public String delete(int id) {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/article/"+id+"/deletion",String.class);
    }

    @HystrixCommand(fallbackMethod = "pageError")
    public String articleDetail() {
        //调用该方法，做了负载均衡，访问不同端口的实例
        //postForObject(),POST 数据到一个URL，返回根据响应体匹配形成的对象,https://blog.csdn.net/itguangit/article/details/78825505
        //使用服务的名称来调用服务,后面是服务的@RequestMapping地址
        return restTemplate.getForObject("http://micro-service-provider-client/articleDetail",String.class);
    }


    /**
     * 启动两个服务，关闭一个，只能访问另一个，两个都关闭，将输出以下语句
     * @return
     */
    public String pageError(){
        return "sorry,this page error";
    }


}
