package com.xworkz.java.instanceof1.example3;

public class Customer {
	public static void main(String[] args) {
		Hotel h = new Hotel();
		Food food = h.orderFood(4);
		if(food instanceof Idly) {
			System.out.println("Ordered Idly");
		}
			else if(food instanceof Dosa) {
				System.out.println("Ordered Dosa");
		}
			else {
				System.out.println("Ordered Vada");
			}
	}

}
