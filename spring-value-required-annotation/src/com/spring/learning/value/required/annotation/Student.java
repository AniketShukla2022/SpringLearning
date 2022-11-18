package com.spring.learning.value.required.annotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	String name;
	
	@Value("${student.interestArea}")
	String interestArea;
	
	
	@Value("${student.hobby}")
	String hobby;
	
	
	public void studentInfo() {
		System.out.println("Name of the student is: "+ name + " Interest area is: "+ interestArea + " hobby is: "+ hobby);
	}
	
}
