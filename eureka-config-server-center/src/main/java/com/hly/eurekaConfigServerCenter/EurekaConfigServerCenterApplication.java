package com.hly.eurekaConfigServerCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaConfigServerCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigServerCenterApplication.class, args);
	}
}
