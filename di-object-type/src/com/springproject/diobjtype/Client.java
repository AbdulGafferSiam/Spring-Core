package com.springproject.diobjtype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student student = context.getBean("student", Student.class);

		student.cheating();
		
		// command + shift + F

		/*
		 * Student student = new Student();
		 * 
		 * student.setMathCheat(new MathCheat());
		 * 
		 * student.cheating();
		 */

		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		
		anotherStudent.startCheating();
		
	}
}
