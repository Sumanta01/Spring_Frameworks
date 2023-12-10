package com.sumanta.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.sumanta.javaConfig")
public class config {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	public Address getAddress() {
		return new Address("First Bean");
	}
	
	@Bean
	@Primary
	public Address addr() {
		return new Address("Second Bean");
	}

}
