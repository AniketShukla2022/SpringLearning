package com.spring.learning.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student st = context.getBean("student", Student.class);
		
		st.displayInfo();
		
		Student st1 = context.getBean("student1", Student.class);
		st1.displayInfoOnlyId();
		((ClassPathXmlApplicationContext) context).close();
	}
}
