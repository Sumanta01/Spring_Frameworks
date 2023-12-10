package com.sumanta.autowire.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/autowire/annot/config.xml");
		Student st= context.getBean("St",Student.class);
		System.out.println(st);
		 
	}

}
