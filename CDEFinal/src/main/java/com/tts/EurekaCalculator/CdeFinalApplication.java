package com.tts.EurekaCalculator;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CdeFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdeFinalApplication.class, args);
	}

}
