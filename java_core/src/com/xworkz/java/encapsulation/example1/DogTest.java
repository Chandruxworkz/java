package com.xworkz.java.encapsulation.example1;

public class DogTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.SetName("Jimmy");
		dog.SetColor("Brown");
		dog.SetBreed("Lab");
		dog.SetAge(1);
		dog.SetPrice(130000);
		System.out.println("Name :"+dog.getName());
		System.out.println("Color :"+dog.getColor());
		System.out.println("Breed :"+dog.getBreed());
		System.out.println("Age :"+dog.getAge());
		System.out.println("Price :"+dog.getPrice());
	}

}
