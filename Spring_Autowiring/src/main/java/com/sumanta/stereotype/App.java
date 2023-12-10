package com.sumanta.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/stereotype/config.xml");
		Employee em=context.getBean("employee",Employee.class);
		//System.out.println(em);
		System.out.println(em.hashCode());
		
		Employee em2=context.getBean("employee",Employee.class);
		System.out.println(em2.hashCode());
		
	
	
		
	}

}
