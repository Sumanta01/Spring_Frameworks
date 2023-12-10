package com.sumanta.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/sumanta/autowire/annotation/config.xml");
		 
		Student student=applicationContext.getBean("St", Student.class);
		System.out.println(student);
	}

}
