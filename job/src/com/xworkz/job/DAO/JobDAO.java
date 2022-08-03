package com.xworkz.job.DAO;

import com.xworkz.job.DTO.JobDTO;

public interface JobDAO {

	boolean save(JobDTO jobDTO);
	
	JobDTO getByID(int id);
	}
	
	
