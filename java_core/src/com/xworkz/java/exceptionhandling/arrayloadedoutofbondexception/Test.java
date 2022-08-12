package com.xworkz.java.exceptionhandling.arrayloadedoutofbondexception;

public class Test {
	public static void main(String[] args) {
		System.out.println("Start");
		int[] a = {10,20,30,40};
		try {
			System.out.println(a[99]);
		}
		catch(ArrayIndexOutOfBoundsException e) { //Specific exception Handler
		System.out.println("Dubba fellow this is Invalid Index");
		}
		System.out.println("End");
		
	}
}
