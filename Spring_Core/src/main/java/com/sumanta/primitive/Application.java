package com.sumanta.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main (String []args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/primitive/config.xml");
	
	Student st=context.getBean("St1",Student.class);
	Student st2=context.getBean("St2",Student.class);
	
	System.out.println(st);
	System.out.println(st2);
		
	}
	
	
	
	
}
