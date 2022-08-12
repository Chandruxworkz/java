package com.xworkz.java.interface1.example2;



public class AccountHolder implements HDFCBank {
	//override
			public void withdraw(){
				System.out.println("Withdrawn");
			}
			//override
	public void deposit() {
		        System.out.println("Deposited");
			}
	public static void main(String[] args) { 
		AccountHolder a=new AccountHolder();
		a.deposit();
		a.withdraw();
	}
}
