package com.sumanta.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/collection/config.xml");
		Student student=context.getBean("St",Student.class);
		System.out.println(student);
	}

}
