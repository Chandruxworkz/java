package com.xworkz.java.collection.list.arraylist.arraylistmethod;

public class Book {
	String brand;
	double price;
	double noOfPages;
	Book() {
	
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(double noOfPages) {
		this.noOfPages = noOfPages;
	}
	@Override
	public String toString() {
		return "Book [brand=" + brand + ", price=" + price + ", noOfPages=" + noOfPages + "]";
	}
	

}
