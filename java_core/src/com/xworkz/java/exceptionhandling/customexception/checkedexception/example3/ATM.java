package com.xworkz.java.exceptionhandling.customexception.checkedexception.example3;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = 10000;
		System.out.println("enter amount to be withdrawn");
		int amount = scan.nextInt();
		
		if(amount<=balance) {
			System.out.println("withdraw Succesful");
			
		}
		else {
			try {
			InsufficientBalanceException obj = new InsufficientBalanceException();
					throw obj;
				
			}
			catch(InsufficientBalanceException e) {
				System.out.println("Insufficient balance");
			}
		}
		
		
	}

}
