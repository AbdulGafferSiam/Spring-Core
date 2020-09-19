package com.springproject.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws SQLException {
		
		// initializing variable
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection conn = null;
		
		// declare bean context file
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// get bean object for JDBCConnection class
		JDBCConnection getConn = context.getBean("jdbc", JDBCConnection.class);
		
		// get bean object for Student class
		Student student = context.getBean("student", Student.class);
		
		// connect database
		try {
			conn = getConn.getJDBCConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String input = null;
		do {
			// set student info
			try {
				student.setStdInfo(conn);
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
			
			// insert student info into database
			try {
				student.insertStdInfo(conn);
				System.out.println("Data successfully inserted!");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			System.out.println("Insert more? (y/n)");
			try {
				input = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while(input.toUpperCase().equals("Y"));

		// connection close
		if (conn != null) {
			try {
				conn.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
