package com.xworkz.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class GrapesInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grapes","root","Ajay@1234");
	System.out.println(connection);
	
	String insert ="insert into grapes_info values (5,'Dominga', '150','big','normal');";
	Statement statement = connection.createStatement();
	int noOfAffect = statement.executeUpdate(insert);
	System.out.println("rowAffected"+noOfAffect);
	}

}
