package com.spring.learning.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SubscribedService {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Airtel airtel = context.getBean("airtel",Airtel.class);
		airtel.activateService();
		((ClassPathXmlApplicationContext) context).close();
	}
}
