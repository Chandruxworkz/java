package com.xworkz.grapes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;



public class MultipleGrapesDemo {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(DBProperties.URL.getValue(),DBProperties.USERNAME.getValue(),DBProperties.PASSWORD.getValue());
			
			String sql = "select * from grapes.grapes_info ";
			Statement statement = connection.createStatement();
			
		    ResultSet resultset = statement.executeQuery(sql);
		    
		     AtomicInteger auto = new AtomicInteger();
		 //  int count=0;
		    while(resultset.next()) {
		    	auto.incrementAndGet();
		    	//count++;
		    	int pid = resultset.getInt(1);
		    	String breed = resultset.getString(2);
		    	double price = resultset.getDouble(3);
		    	String  type = resultset.getString(4);
		    	String size = resultset.getString(5);
		    	System.out.println(pid+" "+breed+" "+price+" "+type+" "+size+" ");
		    	
		    }
		    System.out.println("total rows"+auto);
		}
			
		}


