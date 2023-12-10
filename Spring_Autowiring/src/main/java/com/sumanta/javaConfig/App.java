package com.sumanta.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class App {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		Emp em=context.getBean("getEmp",Emp.class);
		System.out.println(em);
		
	}
}
