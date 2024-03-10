package com.example.demo;

import org.springframework.boot.test.context.*;

import com.example.demo.sample07.*;


@SpringBootTest
public class Example07Test {
	//@Test
	public void test1() {
		Tire tire = new HankukTire();
		Car car = new Car(tire);
		car.drive();
		
		car.타이어교환(new NexenTire());
		car.drive();
	}
}
