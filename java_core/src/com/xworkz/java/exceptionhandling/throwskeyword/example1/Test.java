package com.xworkz.java.exceptionhandling.throwskeyword.example1;

public class Test {
	static void display() throws Exception
	{
		for (int i = 1; i<=5; i++) {
			System.out.println(i);
			Thread.sleep(3000);
		}
	}
	public static void main(String[] args) {
		try {
			display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
