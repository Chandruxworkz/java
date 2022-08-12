 8package com.xworkz.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume","root","Ajay@1234");
		String delete = "delete from company_info where Brand ='KamaSutra'";
		Statement statement = connection.createStatement();
		int noOfAffect = statement.executeUpdate(delete);
		System.out.println("rowAffected"+noOfAffect);
		

	}
}
