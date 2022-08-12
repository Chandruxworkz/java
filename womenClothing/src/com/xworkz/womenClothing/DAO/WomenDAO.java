package com.xworkz.womenClothing.DAO;

import com.xworkz.womenClothing.entity.WomenEntity;

public interface WomenDAO {
	
	boolean save(WomenEntity entity);
	WomenEntity findById(int id);
	void updatedLocationAndNameById(String newLocation,String newName,int id);
	WomenEntity deleteById(int id);

}
