package com.looming.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class SpringbootdemoApplicationTests {

	@Test
	void contextLoads() {
		log.trace("ttttttttt");
		log.debug("ddddddddd");
		log.info("iiiiiiiiii");
		log.warn("wwwwwwwwww");
		log.error("eeeeeeeee");
	}

}