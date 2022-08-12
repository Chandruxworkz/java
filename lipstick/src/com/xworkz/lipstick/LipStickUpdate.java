package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipStickUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipStick","root","Ajay@1234");
	System.out.println(connection);
	
	String update ="insert into lipstick_info values (6,'Mac', 'yellow','200','big');";
	Statement statement = connection.createStatement();
	int noOfAffect = statement.executeUpdate(update);
	System.out.println("rowAffected"+noOfAffect);

}
}
