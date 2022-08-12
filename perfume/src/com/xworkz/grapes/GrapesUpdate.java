package com.xworkz.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grapes","root","Ajay@1234");
	String update ="update grapes_info  Set Price = '200' where Type ='small'";
	Statement statement = connection.createStatement();
	int noOfAffect = statement.executeUpdate(update);
	System.out.println("rowAffected"+noOfAffect);
	

}}
