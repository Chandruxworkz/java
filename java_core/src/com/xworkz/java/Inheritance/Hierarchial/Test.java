package com.xworkz.java.Inheritance.Hierarchial;

public class Test {

	public static void main(String[] args) {
    Car c = new Car();
    System.out.println("Bike Brand :"+c.brand+"-----"+"Bike Cost :"+c.cost);
    c.start();
    System.out.println("------------------");
    Bike b = new Bike();
    System.out.println(b.brand+" "+b.Fuel);
    b.stop();
	}

}
