package com.sumanta.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/setter/config.xml");
	Student student=context.getBean("St",Student.class);
	System.out.println(student.getAddress());
	System.out.println(student);
	
	
	
}
}
