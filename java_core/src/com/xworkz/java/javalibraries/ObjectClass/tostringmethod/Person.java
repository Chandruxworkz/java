package com.xworkz.java.javalibraries.ObjectClass.tostringmethod;

public class Person {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);//implicitly it calls toString()->String Representation
		System.out.println(p.toString());
}

}
