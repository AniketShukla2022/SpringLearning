package com.spring.learning.ioc;

public class Vodaphone implements Sim {
	
	Vodaphone() {
		System.out.println("Vodaphone constructor is called");
	}
	
	@Override
	public void calling() {
		System.out.println("calling from vodaphone Sim");
	}
	
	@Override
	public void data() {
		System.out.println("data using from vodaphone Sim");
	}
}
