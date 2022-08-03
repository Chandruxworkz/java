package com.xworkz.job;

import com.xworkz.job.DAO.JobDAO;
import com.xworkz.job.DAO.JobDAOImpl;
import com.xworkz.job.DTO.JobDTO;
import com.xworkz.job.constants.JobDesignation;
import com.xworkz.job.constants.Qualification;

public class JobRunner {
	
	public static void main(String[] args) {
		
		JobDTO jobDTO=new JobDTO();
		jobDTO.setJid(10);
		jobDTO.setDesignation(JobDesignation.SOFTWAREDEVELOPER);
		jobDTO.setPackagee(900000);
		jobDTO.setQualification(Qualification.BCA);
		jobDTO.setPercentage(78);
		jobDTO.setFresher("yes");
		
		JobDTO jobDTO2=new JobDTO();
		jobDTO.setJid(11);
		jobDTO.setDesignation(JobDesignation.MANAGER);
		jobDTO.setPackagee(4500000);
		jobDTO.setQualification(Qualification.BSC);
		jobDTO.setPercentage(60);
		jobDTO.setFresher("yes");
		
		
		JobDTO jobDTO3=new JobDTO();
		jobDTO.setJid(12);
		jobDTO.setDesignation(JobDesignation.SOFTWAREDEVELOPER);
		jobDTO.setPackagee(900000);
		jobDTO.setQualification(Qualification.BE);
		jobDTO.setPercentage(78);
		jobDTO.setFresher("Yes");
	
		JobDAO dao=new JobDAOImpl();
     	//dao.save(jobDTO);
     	//dao.save(jobDTO2);
     	//dao.save(jobDTO3);
		dao.getByID(1);
		
		
	}

}
