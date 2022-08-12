package com.xworkz.java.singletonclass;

public class Account {
	private Account() {
		System.out.println("Object Created");
	}
   public static void createObject() {
	   Account obj = new Account(); 
		   
	   }
   }

