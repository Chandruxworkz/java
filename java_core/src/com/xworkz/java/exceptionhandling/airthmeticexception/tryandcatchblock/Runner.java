package com.xworkz.java.exceptionhandling.airthmeticexception.tryandcatchblock;

public class Runner {
public static void main(String[] args) {
	try{
		System.out.println(10/0);//Object of ArithmeticException is thrown
	}
	catch(ArithmeticException e) {
		System.out.println("Invalid Denominator");
		}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid Index Position");
	}
	catch(NullPointerException e) {
		System.out.println("Invalid");
	}
	catch(Exception e) {
	System.out.println("Superclass Exception Handler");
    }
 }
}
//Exception e = new ArithmeticException
