package com.example.demo;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.*;

import lombok.extern.slf4j.*;

// Slf4j 객체를 생성해서 주입해 준다
// Slf4j는 표준(스프링이 사용하는 구현체는 logback)
@Slf4j
@SpringBootTest
public class Example10Test {
	@Test
	public void test1() {
		log.error("에러 레벨 메시지");
		log.warn("경고 레벨 메시지");
		log.info("일반 레벨 메시지");
		log.debug("상세 레벨 메시지");
		log.trace("모든 메시지를 다 찍어");
	}
}
