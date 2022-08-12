package com.xworkz.java.Abstraction.example2;

public class ATM implements Bank{
	int balance = 10000;
	//@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance = balance + amount;//balance+=amount;
		System.out.println("Amount Deposited Successfully");
	}
	//@Override
    public void withdraw(int amount) {
    	System.out.println("Withdrawn Rs."+amount);
		balance = balance - amount;//balance-=amount;
		System.out.println("Amount withdrawn Successfully");
		
	}
    //@Override
    public void checkBalance() {
    	System.out.println("Available Balance Rs."+balance);
		
}
	

}
