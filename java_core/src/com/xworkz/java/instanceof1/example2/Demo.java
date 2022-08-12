package com.xworkz.java.instanceof1.example2;

public class Demo {
	public static void main(String[] args) {
		Vehicle v = new Bike();
		if(v instanceof Car) {
			Car c = (Car) v;
		
			System.out.println("Brand :"+c.brand);
			System.out.println("Fuel :"+c.fuel);
		}
		else if(v instanceof Bike)
		{
			Bike b = (Bike) v;
			System.out.println("Brand :"+b.brand);
			System.out.println("Cost :"+b.cost);
	
		}
	}

}
