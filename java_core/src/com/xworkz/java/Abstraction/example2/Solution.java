package com.xworkz.java.Abstraction.example2;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to ATM");
		System.out.println("----------------");
		Scanner scan = new Scanner(System.in);
		Bank b = new ATM();
		while(true) 
		{
		System.out.println("1:Depsit\n2:Withdraw\n3:Check Balance\n4:Exit");
		System.out.println("Enter Choice");
		int choice = scan.nextInt();
		switch (choice)
		{
		case 1:
		System.out.println("Enter Amount to be Deposited");
		int dAmt = scan.nextInt();
		b.deposit(dAmt);
		break;
		
		case 2:
			System.out.println("Enter Amount to be Withdrawn");
			int wAmt = scan.nextInt();
			b.withdraw(wAmt);//b.withdraw(s.nextInt());
			break;
		case 3:
			b.checkBalance();
			break;
		case 4:
			System.out.println("Thank You...!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			
		}
		System.out.println("----------------");
	}

}
}
