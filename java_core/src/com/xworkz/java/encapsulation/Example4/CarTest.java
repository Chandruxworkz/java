package com.xworkz.java.encapsulation.Example4;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car(10000);
		System.out.println("Cost :"+c.getCost());
		c.SetCost(20000);
		System.out.println("Cost :"+c.getCost());
		c.SetCost(50000);
		System.out.println("Cost :"+c.getCost());
	}

}
