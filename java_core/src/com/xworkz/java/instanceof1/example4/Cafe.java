package com.xworkz.java.instanceof1.example4;

public class Cafe {
	Beverage vendingMachine(int choice) {
		if(choice == 1) {
			return new Coffee();
		}
		else if(choice == 2) {
			return new Tea();
		}
		else
		{
			return null;
		}
	}

}
