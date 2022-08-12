package com.xworkz.java.Abstraction.example2;

public class AccountHolder {
	public static void main(String[] args) {
	Bank obj = new ATM();
	obj.checkBalance();
	
	System.out.println("-------------------");
	
	obj.deposit(4000);
	obj.checkBalance();
	
	System.out.println("-------------------");
	
	obj.withdraw(9000);
	obj.checkBalance();
	
	
	

}
}
