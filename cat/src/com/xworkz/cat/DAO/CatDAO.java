package com.xworkz.cat.DAO;

import com.xworkz.cat.entity.CatEntity;

public interface CatDAO {

	boolean save(CatEntity entity);
	CatEntity findById(int id);
	void updatedBreedAndNameById(String newLocation,String newName,int id);
	CatEntity deleteById(int id);

}
