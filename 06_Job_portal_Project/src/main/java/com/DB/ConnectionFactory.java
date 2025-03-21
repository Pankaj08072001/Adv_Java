package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql:/// Job_Database";
	private static final String userName = "root";
	private static final String password = "12345";

	public static Connection getConnected() {
		Connection con = null;
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, userName, password);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		if(con != null) {
			System.out.println("Connection Created Sucessfully !!");
		}
		else {
			System.out.println("Not connected try again ");
		}
		return con;
	}

}
