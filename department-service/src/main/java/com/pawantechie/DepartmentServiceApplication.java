package com.pawantechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
		log.info("spring boot is loaded in department-service...");
		
	}

}
