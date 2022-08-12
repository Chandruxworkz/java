package com.xworkz.java.exceptionhandling.airthmeticexception.tryandcatchblock;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of A :");
		int a = scan.nextInt();
		System.out.println("Enter the value of B");
		int b = scan.nextInt();
		
		
		try {
			System.out.println(a/b);//10/0-> Arithmetic Exception
		}
		catch(ArithmeticException e)//Specific Exception Handler
		{
			System.out.println("dubba fellow, not devided by zero :");
		}
		System.out.println("End");
	}

}
