package com.springproject.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		School student = context.getBean("student", School.class);
		
		student.displayInfo();
		
		School teacher = context.getBean("teacher", School.class);

		teacher.displayInfo();

	}

}
