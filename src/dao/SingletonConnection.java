package dao;

import java.sql.Connection;

import java.sql.DriverManager;


public class SingletonConnection {
	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:8889/DB_CATAL","root","root");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}
	
	}
