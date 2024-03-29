package com.xworkz.java.DTOPractice;

import java.util.ArrayList;

public class BikeDAOImpl implements BikeDAO{

	
	ArrayList<BikeDTO> bikes = new ArrayList<BikeDTO>();
	
	@Override
	public void addBike(BikeDTO dto) {
		bikes.add(dto);
		System.out.println("Added bike details:"+ dto);
		
		
	}

	@Override
	public BikeDTO getBike(String companyName) {
		for(int i=0; i<bikes.size(); i++) {
			if(bikes.get(i).getCompanyName()==companyName) {
				System.out.println("Bikes details:"+bikes.get(i));
				return bikes.get(i);
			}
		}
		return null;
	}

	@Override
	public void updateBike(BikeDTO dto) {
		
	}

	@Override
	public void deleteBike(BikeDTO dto) {
		
	}
	
	@Override
	public String toString() {

		return super.toString();
	}

}
