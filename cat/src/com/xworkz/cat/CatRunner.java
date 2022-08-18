package com.xworkz.cat;

import com.xworkz.cat.DAO.CatDAO;
import com.xworkz.cat.DAO.CatDAOImpl;
import com.xworkz.cat.entity.CatEntity;

public class CatRunner {
	
	public static void main(String[] args) {
		
		CatEntity entity=new CatEntity();
		entity.setId(3);
		entity.setName("gowri");
		entity.setBreed("lab");
		entity.setAge(1);
		entity.setBirthYear(2);
		entity.setClothType("normal");
		
	CatDAO dao=new CatDAOImpl();
		boolean saved=dao.save(entity);
		System.out.println(saved);
//		
//	//	dao.findById(1);
//		
//		
//		//dao.updatedBreedAndNameById("normal", "malli", 1);
//		dao.deleteById(1);
		
	}

}
