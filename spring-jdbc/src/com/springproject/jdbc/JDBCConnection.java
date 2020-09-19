package com.springproject.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {

	private String username;
	
	private String password;
	
	private String url;
	
	private String driver;

	@Required
	@Value("${mysql.username}")
	public void setUsername(String username) {
		this.username = username;
	}

	@Required
	@Value("${mysql.password}")
	public void setPassword(String password) {
		this.password = password;
	}

	@Required
	@Value("${mysql.url}")
	public void setUrl(String url) {
		this.url = url;
	}

	@Required
	@Value("${mysql.driver}")
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public Connection getJDBCConnection() throws Exception {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successful : " + conn);
		return conn;
	}	

}
