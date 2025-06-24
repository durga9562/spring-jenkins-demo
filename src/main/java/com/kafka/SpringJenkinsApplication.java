package com.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	//public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Appkication started............");
	}

	public static void main(String[] args) {
		logger.info("Appkication started............");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
