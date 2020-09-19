package com.springproject.di;

public class Student implements School{
	
	private int id;
	private String name;
	
	// for setter injection
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void displayInfo() {
		System.out.println("Student name is " + name );
		System.out.println("Student id is " + id );
	}
}
