package com.tehilim.folha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "aafunc")
@EnableFeignClients
@SpringBootApplication
public class AafolhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AafolhaApplication.class, args);
	}

}
