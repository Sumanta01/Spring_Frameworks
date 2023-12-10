package com.sumanta.coinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumanta/coinj/config.xml");
		Student st = context.getBean("St1", Student.class);
		System.out.println(st);
	}

}
