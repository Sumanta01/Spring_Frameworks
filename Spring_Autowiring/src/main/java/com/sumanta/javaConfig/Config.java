package com.sumanta.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.sumanta.javaConfig")
public class Config {
	
	
	@Bean
	public Address address() {
		
		return new Address("First Bean....");
	}
	
	@Primary
	@Bean
	public Address getAddress() {
		
		return new Address("Second Bean.....");
	}
	
	@Bean
	public Emp getEmp() {
		return new Emp();
		
	}
	

}
