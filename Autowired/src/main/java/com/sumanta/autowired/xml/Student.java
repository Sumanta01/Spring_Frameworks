package com.sumanta.autowired.xml;


public class Student {
	
	private Address address;
	

	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor Injection Called !");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Injection Called !");
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
	

}
