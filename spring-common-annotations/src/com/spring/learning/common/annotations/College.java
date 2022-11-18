package com.spring.learning.common.annotations;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//@Component("clg")


public class College {
	
	@Value("${college.Name}")
	private String collegeName;
	
	private Principle principle;
	
	public College(Principle principle) {
		this.principle = principle;
	}
	
	public void display() {
		System.out.println("College class object created");
		System.out.println("College Name is: " + collegeName);
		principle.displayPrincipleInfo();
	}
	
}
