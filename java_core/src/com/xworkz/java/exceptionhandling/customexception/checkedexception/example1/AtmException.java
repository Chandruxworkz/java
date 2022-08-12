package com.xworkz.java.exceptionhandling.customexception.checkedexception.example1;

public class AtmException extends Exception{

	@Override
	public String toString() {
		return "you crossed daily limit,";
	}
	@Override
	public String getMessage() {
		
		return "Invalid amount entered, ";
	}

}
