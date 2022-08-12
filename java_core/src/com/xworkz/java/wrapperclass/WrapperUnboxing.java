package com.xworkz.java.wrapperclass;

public class WrapperUnboxing {
	public static void main(String[] args) {
		
	
 // Implicit Unboxing
	Integer i = new Integer(900);
	int j =i;
	System.out.println("i :"+i);
	System.out.println("j :"+j);
	
	//Explicit Unboxing
	Integer k = new Integer(700);
	int l = k.intValue();
	System.out.println("k :"+k);
	System.out.println("l :"+l);
}
}
