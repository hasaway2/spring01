package com.example.demo;

import org.junit.jupiter.api.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

/*
  	로깅 : 시스템의 작동 정보를 출력하는 라이브러리
  	- 레벨에 따른 메시지 분류 : error > warn > info > debug > trace
  	- 최적화된 성능
  	- 다양한 포맷 지정
 */

@SpringBootTest
public class Example09Test {
	@Autowired
	Logger logger;
	
	@Test
	public void test1() {
		logger.error("에러 레벨 메시지");
		logger.warn("경고 레벨 메시지");
		logger.info("일반 레벨 메시지");
		logger.debug("상세 레벨 메시지");
		logger.trace("모든 메시지를 다 찍어");
	}
}
