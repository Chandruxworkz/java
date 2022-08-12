package com.xworkz.KingFisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionStarter {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3360","root","Ajay@1234");
		System.out.println(connection);
		
	}
}
