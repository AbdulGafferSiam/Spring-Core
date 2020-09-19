package com.springproject.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	private int roll;
	private String name;
	private String address;

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setStdInfo(Connection conn) throws IOException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Student Roll : ");
			String s = br.readLine();
			
			if(!s.isBlank() && s.matches("^[0-9]*$"))
				roll = Integer.parseInt(s);
			else {
				roll = 0;
				System.out.println("Please insert valid student roll!");
			}
			
			if(roll != 0 && isRollExist(conn, roll)) {
				roll = 0;
				System.out.println("Roll already exist! Select another.");
			}
			
		} while (roll == 0);

		System.out.print("Student Name : ");
		name = br.readLine();

		System.out.print("Student Address : ");
		address = br.readLine();

	}
	
	public void insertStdInfo(Connection conn) throws SQLException {
		String sql;
		PreparedStatement ps = null;
		
		sql = "INSERT INTO student (roll, name, address) values (?, ?, ?)";
		
		ps = conn.prepareStatement(sql);
		
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.setString(3, address);
		
		ps.executeUpdate(); 
	}
	
	public boolean isRollExist(Connection conn, int roll) throws SQLException {
		String sql;
		int count = 0;
		PreparedStatement ps = null;
		
		sql = "SELECT count(*) from student where roll = ?";
		
		ps = conn.prepareStatement(sql);
		
		ps.setInt(1, roll);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) 
			count = rs.getInt(1);
		
		if(count == 0) return false;
		else return true;
	}
}
