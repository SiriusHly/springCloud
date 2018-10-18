package com.hly.eurekaConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigClientApplication.class, args);
	}

	@Value("${hly}")
	String hly;
	@RequestMapping(value = "/hly")
	public String hi(){
		return hly;
	}
}
