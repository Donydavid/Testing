package com.dony.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootPracticeApplicationTests {
	public static final Logger logger =  LoggerFactory.getLogger(SpringBootPracticeApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("from test class");
		assertEquals(true, true);
	}

}
