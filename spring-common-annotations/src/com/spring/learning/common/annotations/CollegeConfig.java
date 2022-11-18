package com.spring.learning.common.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages = "com.spring.learning.common.annotations")
@PropertySource("classpath:college-config.properties")
public class CollegeConfig {

	
	@Bean
	public Principle principleBean() {
		return new Principle();
	}
	
	
	//here the method name: collegeBean is the actual bean id
	//@Bean      this is used to give the default bean name: method name
	//@Bean(name = {"colBean" , "clg"})  // by this way we can give multiple names to a bean
	
	@Bean(name = "colBean")
	public College collegeBean() {
		return new College(principleBean());
	}
}
