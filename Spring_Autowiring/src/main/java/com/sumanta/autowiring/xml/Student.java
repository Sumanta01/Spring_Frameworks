package com.sumanta.autowiring.xml;

public class Student {
	private Address address;
	
	

	public Student() {
		super();
	}

	public Student(Address address) {
		super();
		System.out.println("Constructor injection call...........");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter injection call..............");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
