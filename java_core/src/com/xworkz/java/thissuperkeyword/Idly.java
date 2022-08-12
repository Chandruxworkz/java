package com.xworkz.java.thissuperkeyword;

public class Idly extends Food {
	String name = "Idly";
	String taste = "Good";
	String colour = "White";
	double price = 15.00;

Idly(String name,String taste,String colour,double price)
{
	System.out.println(name +","+taste+","+colour+","+price);
	System.out.println(this.name+","+this.taste+","+this.colour+","+this.price);
	System.out.println(super.name+","+super.taste+","+super.colour+","+super.price);
}

}