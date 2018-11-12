package com.hly.blogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class BlogServiceApplication {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BlogServiceApplication.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping("/blog")
	public String blog(){
		return "当前是博客服务，端口是"+port;
	}

	@RequestMapping("/toVideo")
	public String toVideo(){
		return  restTemplate.getForObject("http://localhost:8763/video",String.class);
	}
}
