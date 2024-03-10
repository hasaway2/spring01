package com.example.demo.sample08;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.example.demo.sample07.*;

@Component
public class NewCar {
	@Autowired
	private Tire tire;
	
	public void drive() {
		this.tire.떼굴떼굴();
	}
}
