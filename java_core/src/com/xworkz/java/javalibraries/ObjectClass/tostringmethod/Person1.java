package com.xworkz.java.javalibraries.ObjectClass.tostringmethod;

public class Person1 {
	//@Override
	public String toString()
	{
		return "Hai Dinga";
	}
	public static void main(String[] args) {
		{
			Person1 p = new Person1();
			System.out.println(p);//implicitly calls toString();
			System.out.println(p.toString());//explicitly calls toString()
		}
	}
	

}
