package com.sumanta.constructor.collection;

//import java.security.cert.Certificate;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private String address;
	private List<String>course;
	private Certificate certificate;
	
	public Student(int id, String name, String address, List<String> course, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.course = course;
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + "]";
	}
	
	
	
	
	

}
