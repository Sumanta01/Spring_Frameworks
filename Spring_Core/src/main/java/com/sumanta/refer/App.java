package com.sumanta.refer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/refer/config.xml");
		Student st=context.getBean("St" ,Student.class);
		System.out.println(st);
	}

}
