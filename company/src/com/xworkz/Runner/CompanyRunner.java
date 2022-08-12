package com.xworkz.Runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.Entity.CompanyEntity;
import com.xworkz.company.DAO.CompanyDAO;
import com.xworkz.company.DAO.CompanyDAOImpl;

public class CompanyRunner {
	public static void main(String[] args) {
		CompanyEntity companyEntity=new CompanyEntity();
		companyEntity.setId(1);
		companyEntity.setName("Hcl_technologies");
		companyEntity.setLocation("Mysore");
		companyEntity.setCheckInTime(LocalTime.of(8, 00));
		companyEntity.setCheckOutTime(LocalTime.of(7, 00));
		companyEntity.setCreatedBy("Nandesh");
		companyEntity.setCreatedDate(LocalDate.now());
		companyEntity.setUpdatedBy("Suresh");
		companyEntity.setUpdatedDate(LocalDate.now());

		companyEntity.setId(2);
		companyEntity.setName("RakkammaTechnologies");
		companyEntity.setLocation("Banglore");
		companyEntity.setCheckInTime(LocalTime.of(10, 00));
		companyEntity.setCheckOutTime(LocalTime.of(5, 00));
		companyEntity.setCreatedBy("Nandesh");
		companyEntity.setCreatedDate(LocalDate.now());
		companyEntity.setUpdatedBy("Suresh");
		companyEntity.setUpdatedDate(LocalDate.now());


		companyEntity.setId(3);
		companyEntity.setName("Arpita_Technologies");
		companyEntity.setLocation("Delhi");
		companyEntity.setCheckInTime(LocalTime.of(11, 00));
		companyEntity.setCheckOutTime(LocalTime.of(7, 00));
		companyEntity.setCreatedBy("Arpita");
		companyEntity.setCreatedDate(LocalDate.now());
		companyEntity.setUpdatedBy("Bhoomi");
		companyEntity.setUpdatedDate(LocalDate.now());

		CompanyDAO dao=new CompanyDAOImpl();

		Boolean saved=dao.save(companyEntity);
		System.out.println(saved);

		CompanyEntity y=dao.findById(1);
		System.out.println(y);
		
		dao.updateNameAndCreatedBYBYId("Infosys", "SudhaMurthy", 1);
		
		dao.deleteById(2);
	}
}
