package com.tehilim.aafunc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AafuncApplication {

	public static void main(String[] args) {
		SpringApplication.run(AafuncApplication.class, args);
	}

}
