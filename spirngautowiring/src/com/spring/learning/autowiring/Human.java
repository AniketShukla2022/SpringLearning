package com.spring.learning.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("myHeart")
	private Heart heart;
	
	
//	public Human() {
//		System.out.println("Default constructor is called");
//	}
//	
//	
////	public Human(Heart heart) {
////		System.out.println("manual constructor is called ");
////		this.heart = heart;
////	}
//	
//   We can ignore using setters if we are using autowiring. 
//	@Autowired
//	@Qualifier("myHeart")
//	public void setHeart(Heart herHeart) {
//		this.heart = herHeart;
//	}
	
	public void heartPumping() {
		
		if (heart != null) {
			heart.pump();
			System.out.println("Name of heart is: " + heart.getNameOfHeart() + " Age of heart is: " + heart.getAgeOfHeart());
		}
		else {
			System.out.println("You are a dead man now!");
		}
		
	}
}
