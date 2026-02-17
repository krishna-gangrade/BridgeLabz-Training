package com.jdbc.establishdatabaseconnection.newconnection;

import java.sql.*;

public class DatabaseConfig {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/practice_db";
// Connection properties
		java.util.Properties properties = new java.util.Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "2003");
		properties.setProperty("useSSL", "false");
		properties.setProperty("serverTimezone", "UTC");
		properties.setProperty("allowPublicKeyRetrieval", "true");
		return DriverManager.getConnection(url, properties);
	}
}
