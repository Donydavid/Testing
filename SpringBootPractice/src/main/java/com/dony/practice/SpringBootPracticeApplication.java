package com.dony.practice;

import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPracticeApplication implements CommandLineRunner {
	public static final Logger logger =  LoggerFactory.getLogger(SpringBootPracticeApplication.class);

	public static void main(String[] args) {
		logger.info("started");
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("from command line arguments");
		// TODO Auto-generated method stub
		
	}

}
