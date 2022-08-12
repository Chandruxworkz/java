package com.xworkz.java.exceptionhandling.customexception.checkedexception.example1;

public class AtmMachine {
	void draw(int amount) throws AtmException {
		if(amount<100 || amount >50000 || amount%100 !=0) {
			AtmException atmExp = new AtmException();
			throw atmExp;
		}
		else {
			System.out.println("Please collect the cash");
		}
		
	}

}
