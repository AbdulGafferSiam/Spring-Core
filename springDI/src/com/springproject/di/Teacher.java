package com.springproject.di;

public class Teacher implements School{
	
	private int id;
	private String name;
	
	// for constructor injection
	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Teacher name is " + name );
		System.out.println("Teacher id is " + id );
	}
}
