package com.xworkz.java.exceptionhandling.customexception.checkedexception.example2;



public class C {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}
	}

}
//intrrupted exception-->checked Exception