package com.xworkz.java.exceptionhandling.customexception.uncheckedexception.example2;

public class FlipkartTest {
	public static void main(String[] args) {
		Product pedigree = new Product("Pedigree", 7000.00);
		Product lakmecream = new Product("Lakme", 500.00);
		Product soap = new Product("Soap", 30.00);
		Product shampoo = new Product("Shampoo", 50.00);
		Product bicycle = new Product("Bicycle", 5000.00);
		
		Flipkart flipkart = new Flipkart();
		flipkart.addProduct(pedigree);
		flipkart.addProduct(lakmecream);
		flipkart.addProduct(soap);
		flipkart.addProduct(shampoo);
		flipkart.addProduct(bicycle);
		try {
			Product product = flipkart.grtProduct("Book");
			System.out.println(product);
		}
		catch(ProductException e) {
			System.out.println(e);
		}
	}

}
