package com.xworkz.java.encapsulation.example1;

public class Dog {
	private String name;
	private String color;
	private String breed;
	private int age;
	private double price;
	
	public Dog(){
		
		
	}
	public void SetName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
		
	}
	public void SetColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
		
	}
	public void SetBreed(String breed) {
		this.breed = breed;
	}
	public String getBreed() {
		return breed;
		
	}
	public void SetAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
		
	}
	public void SetPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
		
	}

}
