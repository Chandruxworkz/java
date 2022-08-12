package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingfisherUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kingfisher","root","Ajay@1234");
		String update ="update new_table Set type = 'large' where price ='250'";
		Statement statement = connection.createStatement();
		int noOfAffect = statement.executeUpdate(update);
		System.out.println("rowAffected "+noOfAffect);
		

	}
}
