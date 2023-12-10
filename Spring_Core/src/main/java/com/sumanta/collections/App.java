package com.sumanta.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/collections/config.xml");
		 Student st=context.getBean("St1",Student.class);
		 System.out.println(st);
		
	}

}
