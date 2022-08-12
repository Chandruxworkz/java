package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.grapes.DBProperties;

public class KingfisherSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection=DriverManager.getConnection(DBProperties.URL.getValue(),DBProperties.USERNAME.getValue(),DBProperties.PASSWORD.getValue());

		System.out.println(connection);

		String select= "select * from grapes_info ;";


		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(select);
		System.out.println("resultSet"+resultSet);

		boolean rowExist  =	resultSet.next();
		System.out.println(rowExist);

		if(rowExist==true) {

			int pid=resultSet.getInt(1);
			System.out.println(pid);

			String breed =resultSet.getString(2);
			System.out.println(breed);

			Double price=resultSet.getDouble(3);
			System.out.println(price);

			String type=resultSet.getString(4);
			System.out.println(type);

			String size=resultSet.getString(5);
			System.out.println(size);

		}
		else
		{
			System.err.println("data not found");
		}
	}




}
