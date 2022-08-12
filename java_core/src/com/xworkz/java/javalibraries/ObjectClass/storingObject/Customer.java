package com.xworkz.java.javalibraries.ObjectClass.storingObject;

public class Customer {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("HP", 20000, "4GB");
		Laptop l2 = new Laptop("ACER", 30000, "6GB");
		Laptop l3 = new Laptop("DELL", 25000, "8GB");
		Laptop l4 = new Laptop("Lenovo", 350000,"16GB");
		Laptop[] l = {l1,l2,l3,l4};
		for(int i=0; i<l.length; i++) {
			System.out.println(l[i]);
		}
		
	}

}
/*
  Laptop[] l = new Laptop[4];
 
		l[0] = l1;
		l[1] = l2;
		l[2] = l3;
		l[3] = l4;
	*/