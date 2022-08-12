package com.xworkz.java.exceptionhandling.customexception.uncheckedexception.example2;

public class ProductException extends RuntimeException
{

	@Override
	public String toString() {
		return "Product not found";
	}

}
