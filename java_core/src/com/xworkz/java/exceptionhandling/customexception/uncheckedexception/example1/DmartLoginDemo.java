package com.xworkz.java.exceptionhandling.customexception.uncheckedexception;

public class DmartLoginDemo {
	public static void main(String[] args) {
		
	
	String id = "ce123";
	int pass = 12334;
	
	if(id.equals("ce123")) {
		if(pass==1233) {
			System.out.println("Login successful");
		}
		else {
			try {
			DmartLogin dl = new DmartLogin();
			throw dl;
			} catch(DmartLogin e) {
				System.out.println("Invalid password entered");
				
			}
		}
	}
}

}


