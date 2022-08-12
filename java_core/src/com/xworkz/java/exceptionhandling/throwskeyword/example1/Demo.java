package com.xworkz.java.exceptionhandling.throwskeyword.example1;

public class Demo {
	static void div()throws ArithmeticException{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			div();
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		System.out.println("End");
	}

}
