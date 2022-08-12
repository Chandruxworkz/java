package com.xworkz.java.Constructor;

public class Dog {
	//parameterized custom constructor
	Dog(String name){
		System.out.println("name: "+name);
	}
public static void main(String[] args) {
	Dog dog = new Dog("Labroder");
}

}
