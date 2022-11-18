package com.spring.learning.assignment;

public class Airtel {
	
	private IService service;
	
	public void setService(IService service) {
		this.service = service;
	}
	
	public void activateService() {
		service.service();
	}
}
