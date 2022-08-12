package com.xworkz.java.DTOPractice;

public interface BikeService {

	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);
}
