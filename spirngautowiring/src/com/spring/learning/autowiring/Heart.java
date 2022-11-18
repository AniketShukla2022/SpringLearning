package com.spring.learning.autowiring;

public class Heart {
	
	private String nameOfHeart;
	private int ageOfHeart;
	
	public String getNameOfHeart() {
		return this.nameOfHeart;
	}
	
	public void setNameOfHeart(String nameOfHeart) {
		this.nameOfHeart = nameOfHeart;
	}
	
	public int getAgeOfHeart() {
		return this.ageOfHeart;
	}
	
	public void setAgeOfHeart(int ageOfHeart) {
		this.ageOfHeart = ageOfHeart;
	}
	
	public void pump() {
		System.out.println("Heart is pumping....you are alive");
	}
}
