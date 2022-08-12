package com.xworkz.java.exceptionhandling.customexception.uncheckedexception.example2;

public class Flipkart 
{
Product[] products = new Product[10];
void addProduct(Product product) {
	for (int i = 0; i < products.length; i++) {
			System.out.println("product added : "+products[i]);
		break;
	}
}

Product grtProduct(String productName) {
	Product product = null;
	for(int i =0;i<products.length;i++) {
		if(products[i] != null && products[i].getProductName().equals(productName)) {
			product = products[i];
			
		}
	}
	if(product !=null ) {
		return product;
	}
	else {
		ProductException po = new ProductException();
		throw po;
	}
}
}
 