package com.xworkz.homestay;

import com.xworkz.homestay.DAO.HomestayDAO;
import com.xworkz.homestay.DAO.HomestayImpl;
import com.xworkz.homestay.entity.HomestayEntity;

public class HomestayRunner {
	public static void main(String[] args) {
		HomestayEntity entity=new HomestayEntity();
		entity.setId(1);
		entity.setName("aladagudda");
		entity.setLocation("ckm");
		
		
		entity.setId(2);
		entity.setName("Badami");
		entity.setLocation("Bagalkot");
		
		
		HomestayDAO dao=new HomestayImpl();
		boolean saved=dao.save(entity);
		System.out.println(saved);
	}

}
