package com.sumanta.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("ad2")
	private Address address;
	
//	@Autowired
//	public Student(Address address) {
//		super();
//		this.address = address;
//		System.out.println("Constructor Injection called!");
//	}
//	
	public Address getAddress() {
		return address;
	}
   // @Autowired
	public void setAddress(Address address) {
		System.out.println("Setter injection called !");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	

}
