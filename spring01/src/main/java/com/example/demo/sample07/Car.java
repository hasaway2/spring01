package com.example.demo.sample07;

public class Car {
	private Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public void drive() {
		this.tire.떼굴떼굴();
	}
	
	public void 타이어교환(Tire tire) {
		this.tire = tire;
	}
}
