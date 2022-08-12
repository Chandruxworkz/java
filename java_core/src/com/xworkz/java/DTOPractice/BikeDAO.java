package com.xworkz.java.DTOPractice;

public interface BikeDAO {
	
	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);

}
