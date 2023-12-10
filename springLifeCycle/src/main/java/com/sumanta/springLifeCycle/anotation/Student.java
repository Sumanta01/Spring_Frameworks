package com.sumanta.springLifeCycle.anotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init() throws Exception{
		
		System.out.println("Initialize the object !");
	}
	
    @PreDestroy
	public void destroy()throws Exception{
		System.out.println("Destroy the object !");
		
	}
	

}
