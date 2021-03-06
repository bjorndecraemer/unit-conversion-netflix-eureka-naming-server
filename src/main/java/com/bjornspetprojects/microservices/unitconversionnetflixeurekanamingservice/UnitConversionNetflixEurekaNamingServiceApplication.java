package com.bjornspetprojects.microservices.unitconversionnetflixeurekanamingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UnitConversionNetflixEurekaNamingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitConversionNetflixEurekaNamingServiceApplication.class, args);
	}

}

