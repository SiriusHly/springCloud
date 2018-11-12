package com.hly.ribbonService.service;



import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author :hly
 * @github :github.com/SiriusHly
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/10/16
 */
@Service
public class BlogService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String blogService() {
        return restTemplate.getForObject("http://blog-service/blog",String.class);
    }

    /**
     * 启动两个服务，关闭一个，只能访问另一个，两个都关闭，将输出以下语句
     * @return
     */
    public String error(){
        return "sorry this service fail to visit";
    }

}
