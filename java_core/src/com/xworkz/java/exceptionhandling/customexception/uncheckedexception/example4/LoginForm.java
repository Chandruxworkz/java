package com.xworkz.java.exceptionhandling.customexception.uncheckedexception.example4;

import java.util.Scanner;

public class LoginForm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter User Id:");
		String id = scan.next();
		System.out.println("Enter Password:");
		int password = scan.nextInt();
		
	
		if(id.equals("admin"))
		{
			if(password == 125) {
				System.out.println("Login Succesful");
			}
			else {
				try {
				
				InvalidPasswordException obj = new InvalidPasswordException();
				//throw new InvalidPasswordException
				throw obj;
			}
				catch(InvalidPasswordException e)
				{
					System.out.println("Invalid Password Entered");
					}
				}
		}
	}

}
