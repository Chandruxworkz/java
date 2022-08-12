package com.xworkz.womenClothing;

import java.time.LocalDate;

import com.xworkz.womenClothing.DAO.WomenDAO;
import com.xworkz.womenClothing.DAO.WomenDAOImpl;
import com.xworkz.womenClothing.entity.WomenEntity;

public class WomenRunner {
	
	public static void main(String[] args) {
		
		WomenEntity entity=new WomenEntity();
		entity.setId(4);
		entity.setName("bodycare");
		entity.setShopName("vijaya");
		entity.setLocation("btm");
		entity.setCreateDate(LocalDate.now());
		entity.setCreatedBy("sachin");
		entity.setOwner("sachin");
		entity.setPricePerDay(10000);
		
		WomenDAO dao=new WomenDAOImpl();
//		+boolean saved=dao.save(entity);ystem.out.println(saved1);
		WomenEntity info = dao.findById(1);
		System.out.println(info);
		
		dao.updatedLocationAndNameById("rajajinagar","arpita", 1);
		dao.deleteById(2);
		
	}

}
