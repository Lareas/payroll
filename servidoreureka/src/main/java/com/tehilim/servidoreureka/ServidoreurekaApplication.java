package com.tehilim.servidoreureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServidoreurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidoreurekaApplication.class, args);
	}

}
