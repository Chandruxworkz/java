package com.xworkz.java.DTOPractice;

public class BikeServiceImpl implements BikeService{

	BikeDAO bikeDAO=new BikeDAOImpl();
	
	@Override
	public void addBike(BikeDTO dto) {
		double price=dto.getPrice();
		if(price>800000) {
			bikeDAO.addBike(dto);
			System.out.println("bike added");
		}
		else {
			System.err.println("unavailable");
		}
		
	}

	@Override
	public BikeDTO getBike(String companyName) {
		return bikeDAO.getBike(companyName);
	}

	@Override
	public void updateBike(BikeDTO dto) {
		String color=dto.getColor();
		if(color!="blue") {
			bikeDAO.updateBike(dto);
			System.out.println("available");
		}else {
			System.err.println("not available");
		}
		
	}

	@Override
	public void deleteBike(BikeDTO dto) {
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
