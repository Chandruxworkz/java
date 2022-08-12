package com.xworkz.dog;

import com.xworkz.dog.DAO.DogDAO;
import com.xworkz.dog.DAO.DogDAOImpl;
import com.xworkz.dog.entity.DogEntity;

public class DogRunner {
	public static void main(String[] args) {
		DogEntity entity=new DogEntity();
		entity.setId(4);
		entity.setBreed("dash and dash");
		entity.setAge(2);
		entity.setName("guddu");
		entity.setBirthYear(2020);
		entity.setClothType("shirt");
		
		DogDAO dao=new DogDAOImpl();
//	boolean saved=dao.save(entity);
//		System.out.println(saved);
		//dao.findById(1);
		//dao.updatedBreedAndNameById("shitzu", "milo", 1);
		dao.deleteById(3);
		
	}

}
