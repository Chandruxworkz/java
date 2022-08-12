package com.xworkz.java.array.example1;

public class Lipstick {
	String brand;
	String color;
	double price;

	Lipstick(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		
  	}

	@Override
	public String toString() {
		return "Lipstick [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
}