package com.sumanta.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/xml/config.xml");
		context.registerShutdownHook();
		Student st=context.getBean("St1",Student.class);
		System.out.println(st);
	}

}
