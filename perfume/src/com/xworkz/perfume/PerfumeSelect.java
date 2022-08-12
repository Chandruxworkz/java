package com.xworkz.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.grapes.DBProperties;

public class PerfumeSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(DBProperties.URL.getValue(),DBProperties.USERNAME.getValue(),DBProperties.PASSWORD.getValue());
		
		System.out.println(connection);
		
		String select= "select * from company_info ;";
		
	
		Statement statement=connection.createStatement();
				ResultSet resultSet=statement.executeQuery(select);
	      	System.out.println("resultSet"+resultSet);
	   	      boolean rowExist=	resultSet.next();
	      System.out.println(rowExist);
	      
	  	if(rowExist==true) {
	      
	      int idcompany_info=resultSet.getInt(1);
	      System.out.println(idcompany_info);
	      
	      String brand =resultSet.getString(2);
          System.out.println(brand);
          
          Double price=resultSet.getDouble(3);
          System.out.println(price);
          
          String fragnance=resultSet.getString(4);
          System.out.println(fragnance);
          
          String type=resultSet.getString(5);
          System.out.println(type);
         
       	}
	  	else
	      	{
	      		System.err.println("data not found");
	      	}
	}

}


