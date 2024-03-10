package com.example.demo;

import org.springframework.boot.test.context.*;

import com.example.demo.sample06.*;


// 스프링을 테스트하려면 스프링 프레임워크가 실행해 ApplicationContext를 생성한다
@SpringBootTest
public class Example06Test {
	//@Test
	public void test1() {
		한국타이어 tire = new 한국타이어();
		자동차 car = new 자동차(tire, null);
		car.drive();
		
		car.타이어교환(new 넥센타이어());
		car.drive();
	}
}
