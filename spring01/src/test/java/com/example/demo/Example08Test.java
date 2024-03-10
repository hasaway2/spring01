package com.example.demo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import com.example.demo.sample08.*;

@SpringBootTest
public class Example08Test {
	@Autowired
	NewCar car;
	
	@Test
	public void test1() {
		car.drive();
	}
}
