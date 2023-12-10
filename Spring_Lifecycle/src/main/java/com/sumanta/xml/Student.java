package com.sumanta.xml;

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
	
	public void init() {
		System.out.println("Init method Started..........");
	}
	
	public void destroy() {
		System.out.println("Destroy method started ............");
	}

}
