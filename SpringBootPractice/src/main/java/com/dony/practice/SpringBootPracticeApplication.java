package com.dony.practice;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPracticeApplication {
	public static final Logger logger =  LoggerFactory.getLogger(SpringBootPracticeApplication.class);

	public static void main(String[] args) {
		logger.info("started");
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}

}
