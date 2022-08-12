package com.xworkz.job.DAO;

import com.xworkz.job.DTO.JobDTO;

public interface JobDAO {

	boolean save(JobDTO jobDTO);
	JobDTO findById(Integer id,String designation);
	JobDTO findByIdAndDesignationAndQualification(Integer id,String designation,String qualification);
	int getTotal();
	String isFresherById(Integer id);
	Double getMaxPercentage();
	JobDTO getByID(int id);

	}
	
	
