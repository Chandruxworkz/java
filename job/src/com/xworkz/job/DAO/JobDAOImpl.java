package com.xworkz.job.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.job.DTO.JobDTO;
import com.xworkz.job.constants.DBProperties;
//import static com.xworkz.job.constants.DbProperties.*;
import com.xworkz.job.constants.DBProperties.*;
import com.xworkz.job.constants.JobDesignation;
import com.xworkz.job.constants.Qualification;

public abstract class JobDAOImpl implements JobDAO {

	@Override
	public boolean save(JobDTO jobDTO) {
		
		try {
			Connection connection=DriverManager.getConnection(DBProperties.URL.getValue(),DBProperties.USERNAME.getValue(),DBProperties.SECRET.getValue());
			String insert="insert into jobdetails values(?,?,?,?,?,?); ";
			
			PreparedStatement preparedStatement=connection.prepareStatement(insert);
			
			System.out.println("insert query"+ insert);
			
			preparedStatement.setInt(1,jobDTO.getJid());
			preparedStatement.setString(2, jobDTO.getDesignation().getDesignation());
			preparedStatement.setDouble(3, jobDTO.getPackagee());
			preparedStatement.setString(4, jobDTO.getQualification().getQualification());
			preparedStatement.setDouble(5, jobDTO.getPercentage());
			preparedStatement.setString(6, jobDTO.isFresher());
			System.out.println("statement"+preparedStatement);
			
			int rowAffected= preparedStatement.executeUpdate();
		
			return rowAffected > 1 ? true :false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public JobDTO getByID(int id) {
		try {
			Connection connection=DriverManager.getConnection(DBProperties.URL.getValue(),DBProperties.USERNAME.getValue(),DBProperties.SECRET.getValue());
			
			String select="select * from jobdetails where jid=?";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			
//			ResultSet  resultSet=preparedStatement.executeQuery();
//			while(resultSet.next()) {
//				int jid=resultSet.getInt(1);
//				String designation=resultSet.getString(2);
//				double packagee=resultSet.getDouble(3);
//				String qualification=resultSet.getString(4);
//				double percentage=resultSet.getDouble(5);
//				String fresher=resultSet.getString(6);
//				
//				
//				
//				JobDTO jobDTO=new JobDTO();
//				jobDTO.setJid(jid);
//				jobDTO.setDesignation(JobDesignation.valueOf(designation));
//				jobDTO.setPackagee(packagee);
//				jobDTO.setQualification(Qualification.valueOf(qualification));
//				jobDTO.setPercentage(percentage);
//				jobDTO.setFresher(fresher);
//				return jobDTO;
		} catch (SQLException e) {
			System.out.println("no data found");
			e.printStackTrace();
		}
		
		return null;
	}

	

}
