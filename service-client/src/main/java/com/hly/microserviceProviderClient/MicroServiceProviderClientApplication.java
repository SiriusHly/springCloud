package com.hly.microserviceProviderClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceProviderClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProviderClientApplication.class, args);
	}
}
