package com.spring.learning.common.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("colBean",College.class);
		college.display();
		((AnnotationConfigApplicationContext)context).close();
	}
	
}
