package com.xworkz.java.instanceof1.example4;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
	Cafe c = new Cafe();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Choice:");
	System.out.println("1:Coffee\n2:Tea");
	int choice = s.nextInt();
	Beverage beverage = c.vendingMachine(choice);
	if(beverage instanceof Coffee) {
		System.out.println("Drinking Coffee");
	}
		else if(beverage instanceof Tea) {
			System.out.println("Drinking Tea");
	}
		else {
			System.out.println("Invalid");
		}
}
	

}

