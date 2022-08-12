package com.xworkz.java.instanceof1.example1;

public class Solution {
	public static void main(String[] args) {
		Father f = new Daughter();
		
		if (f instanceof Son)
		{
			System.out.println("Downcasting to Son");
			Son s = (Son) f;
			System.out.println("Age of Father :"+s.x);
			System.out.println("Age of Son :"+s.y);
	    }
		else if(f instanceof Daughter) 
		{
			System.out.println("Downcasting to Daughter");
			Daughter d = (Daughter) f;
			System.out.println("Age of Father :"+d.x);
			System.out.println("Age of Daughter :"+d.z);
		}
	}

}
