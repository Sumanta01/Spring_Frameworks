package com.sumanta.setter;



public class Student {

	private String email;
	private Address address;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [email=" + email + ", address=" + address + "]";
	}
	
	
	
	
	

}
