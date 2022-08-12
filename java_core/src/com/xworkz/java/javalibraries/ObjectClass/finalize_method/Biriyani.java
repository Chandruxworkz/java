package com.xworkz.java.javalibraries.ObjectClass.finalize_method;

public class Biriyani {
	String name;
	double price;
	
	Biriyani(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void finalize()throws Throwable {
		System.out.println("Finalize method is called");
	}
	@Override
	public String toString() {
		return "Biriyani [name=" + name + ", price=" + price + "]";
	}
	

}
