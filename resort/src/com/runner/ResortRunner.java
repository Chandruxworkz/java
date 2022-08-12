package com.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworxz.resort.DAO.ResortDAO;
import com.xworxz.resort.DAO.resortDAOImpl;
import com.xworxz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
		ResortEntity resortEntity = new ResortEntity();
		resortEntity.setId(1);
		resortEntity.setName("Mango Mist");  
		resortEntity.setLocation("Kanakapur Road");
		resortEntity.setCheckInTime(LocalTime.of(12, 00));
		resortEntity.setCheckOutTime(LocalTime.of(11, 00));
		resortEntity.setCreateBy("Arpita");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setUpdateDate(LocalDate.now());
		resortEntity.setOwner("Chetan Hiremath");
		resortEntity.setPricePerDay(200000D);
		
		resortEntity.setId(2);
		resortEntity.setName("Rakkamma");  
		resortEntity.setLocation("KR Puram");
		resortEntity.setCheckInTime(LocalTime.of(12, 00));
		resortEntity.setCheckOutTime(LocalTime.of(11, 00));
		resortEntity.setCreateBy("Arpita");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setUpdateDate(LocalDate.now());
		resortEntity.setOwner("Sharan");
		resortEntity.setPricePerDay(200000D);
		
		
		resortEntity.setId(3);
		resortEntity.setName("BASSC");  
		resortEntity.setLocation("BTM Layout");
		resortEntity.setCheckInTime(LocalTime.of(9, 00));
		resortEntity.setCheckOutTime(LocalTime.of(12, 00));
		resortEntity.setCreateBy("Sachin");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setUpdateDate(LocalDate.now());
		resortEntity.setOwner("Sharan");
		resortEntity.setPricePerDay(1500000D);
		
		resortEntity.setId(4);
		resortEntity.setName("Maharaja Resort");  
		resortEntity.setLocation("");
		resortEntity.setCheckInTime(LocalTime.of(12, 00));
		resortEntity.setCheckOutTime(LocalTime.of(11, 00));
		resortEntity.setCreateBy("Ajay");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setUpdateDate(LocalDate.now());
		resortEntity.setOwner("Nandish");
		resortEntity.setPricePerDay(30000000D);




		ResortDAO resortDAO = new resortDAOImpl();
		boolean saved=resortDAO.save(resortEntity);
		System.out.println(saved);
	}

}
