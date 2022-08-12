package com.xworkz.dog.DAO;

import com.xworkz.dog.entity.DogEntity;

public interface DogDAO {

	boolean save(DogEntity entity);
	DogEntity findById(int id);
	void updatedBreedAndNameById(String newLocation,String newName,int id);
	DogEntity deleteById(int id);
}
