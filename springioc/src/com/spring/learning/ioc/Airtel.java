package com.spring.learning.ioc;

public class Airtel implements Sim {

	Airtel() {
		System.out.println("Airtel constructor is called");
	}
	
	@Override
	public void calling() {
		System.out.println("calling from airtel Sim");
	}

	@Override
	public void data() {
		System.out.println("data using from airtel Sim");
	}
	
}
