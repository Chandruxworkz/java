package com.xworkz.java.Constructor;

public class Car {
	//Non parameterized custom constructor
	Car()
	{
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Car C = new Car();
		System.out.println("End");
		
	}

}
