package com.xworkz.java.DTOPractice;

public class BikeApplicationRunner {

	public static void main(String[] args) {
		
		BikeDTO honda=new BikeDTO();
		honda.setCompanyName("Activa");
		honda.setModelNo(76);
		honda.setColor("black");
		honda.setPrice(4000000);
		
		
		
		BikeDTO pulsur=new BikeDTO();
		honda.setCompanyName("NS200");
		honda.setModelNo(78);
		honda.setColor("red");
		honda.setPrice(8000000);
		
		
		
		
		BikeDTO gixxer=new BikeDTO();
		honda.setCompanyName("wego");
		honda.setModelNo(98);
		honda.setColor("pink");
		honda.setPrice(900000);
		
		System.out.println(" ");
		
		BikeService service=new BikeServiceImpl();
		service.addBike(gixxer);
		service.addBike(pulsur);
		service.addBike(honda);
		
		
		
		//service.updateBike(pulsur);
		
		gixxer.setColor("brown");
		service.updateBike(gixxer);
		
		
		
	}
}
