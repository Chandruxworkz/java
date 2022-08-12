package com.xworkz.java.singletonclass;

public class User {
	public static void main(String[] args) {
		Account.createObject();
		Account.createObject();
		Account.createObject();
		/*Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		Account a4 = new Account();*/
	}

}
