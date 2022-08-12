package com.xworkz.java.exceptionhandling.throwablemethod;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10/0);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("End");
		}
	}
}








/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.xworkz.java.exceptionhandling.throwablemethod.Demo.main(Demo.java:6)
*/


