package com.hly.serviceRibbon.service;

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
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        //调用该方法，做了负载均衡，访问不同端口的实例
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name="+name,String.class);
    }

}
