package com.xworkz.java.javalibraries.ObjectClass.finalize_method;

public class FinalizeDemoMethod {
	public static void main(String[] args) {
		Biriyani biriyani = new Biriyani("Mallappa", 20);
		biriyani = null;
		System.gc();
		System.out.println(biriyani);
	
		
	}

}
