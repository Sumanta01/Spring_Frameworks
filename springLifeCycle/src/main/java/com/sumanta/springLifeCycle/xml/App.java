package com.sumanta.springLifeCycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/springLifeCycle/xml/config.xml");
		context.registerShutdownHook();
		Student student=context.getBean("St", Student.class);
		System.out.println(student);
	}

}
