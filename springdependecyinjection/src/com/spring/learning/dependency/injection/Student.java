package com.spring.learning.dependency.injection;

public class Student {
	private int id;
	private String studentName;
	
	
	Student(int id) {
		this.id = id;
	}
	
	Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	public void displayInfo() {
		System.out.println("Name of the student is: "+ studentName + " And id is: "+ id);
	}
	
	public void displayInfoOnlyId() {
		System.out.println("Id of the student is: "+ id);
	}
}
