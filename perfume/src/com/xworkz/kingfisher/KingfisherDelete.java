package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingfisherDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher","root","Ajay@1234");
		System.out.println(connection);
		String delete = "delete from kingfisher.new_table where Size ='Medium'";
		Statement statement = connection.createStatement();
		int noOfAffect = statement.executeUpdate(delete);
		System.out.println("rowAffected "+noOfAffect);
	}		

}
