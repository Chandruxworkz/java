package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingFisherInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grapes","root","Ajay@1234");
		System.out.println(connection);
		
		String insert ="insert into kingfisher.new_table values (5,'750ml', '250','KF Ultra','Larger');";
		Statement statement = connection.createStatement();
		int noOfAffect = statement.executeUpdate(insert);
		System.out.println("rowAffected"+noOfAffect);
		}

}
