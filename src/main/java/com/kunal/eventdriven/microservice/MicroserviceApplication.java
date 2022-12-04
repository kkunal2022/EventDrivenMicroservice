package com.kunal.eventdriven.microservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceApplication {
	private static final Logger logger = LogManager.getLogger(MicroserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
		logger.info("Spring Boot Event Driven Microservice Application Started Successfully ");
	}

}
