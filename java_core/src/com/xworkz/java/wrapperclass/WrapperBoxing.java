package com.xworkz.java.wrapperclass;

public class WrapperBoxing {
	public static void main(String[] args) {
		//Implicit Boxing
		int a = 30;
		Integer b = a;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	
	   //Explicit Boxing
	    int c = 20;
	    
	       Integer d = new Integer(c);
	    System.out.println("c :"+c);
	    System.out.println("d :"+d);


}
}
