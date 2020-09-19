package com.springproject.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	@Value("${student.interestedCourse}")
	private String interestedCourse;

	@Value("${student.hobby}")
	private String hobby;

	@Required
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * 
	 * @Value("${student.interestedCourse}") public void setInterestedCourse(String
	 * interestedCourse) { this.interestedCourse = interestedCourse; }
	 * 
	 * @Value("${student.hobby}") public void setHobby(String hobby) { this.hobby =
	 * hobby; }
	 */

	public void displayInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student interested course: " + interestedCourse);
		System.out.println("Student hobby: " + hobby);
	}
}
