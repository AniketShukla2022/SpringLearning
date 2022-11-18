package com.spring.learning.dependency.injection.object.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student st = context.getBean("stu",Student.class);
		//System.out.println("loading everything");
		st.cheating();
		((ClassPathXmlApplicationContext) context).close();
	}
	
}
