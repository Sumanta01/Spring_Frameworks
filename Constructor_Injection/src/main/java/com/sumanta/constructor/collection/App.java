package com.sumanta.constructor.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/constructor/collection/config.xml");
		
		Student student=context.getBean("St", Student.class);
		Certificate ctCertificate=context.getBean("Ct", Certificate.class);
		System.out.println(ctCertificate);
		System.out.println(student);
	}

}
