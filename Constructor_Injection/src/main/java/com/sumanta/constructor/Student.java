package com.sumanta.constructor;

public class Student {
	private int id;
	private String name;
	private String address;
	
	public Student(int id, String name) {
		System.out.println("int, String Constructor Called");
		this.id = id;
		this.name = name;
	}
	
	
	

	public Student( String name, String address) {
		System.out.println("String, String Constructor Called");  //Constructor Ambiguity Problem(Solve using type and index)
		this.name = name;
		this.address = address;
	}
	
	public Student( String name, int id) {
		System.out.println("String, int Constructor Called");  //Constructor Ambiguity Problem
		this.name = name;
		this.id=id;
	}





	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}




	
	
	
	

}
