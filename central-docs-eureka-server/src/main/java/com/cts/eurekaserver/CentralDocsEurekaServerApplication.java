package com.cts.eurekaserver;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CentralDocsEurekaServerApplication {

	//http://localhost:9093/swagger-ui.html
	public static void main(String[] args) {
		SpringApplication.run(CentralDocsEurekaServerApplication.class, args);
	}
}
