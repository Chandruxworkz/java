package com.xworkz.java.string;

import java.util.Objects;

public class StringDemo {
	public static void main(String[] args) {
		
		String name = "Darshan"; 
		String name1 = "Darshan";
		String str = new String("Malinga");
		System.out.println(Objects.equals(name, name1));
		System.out.println(str);
		
		System.out.println(name.intern()== str.intern() );

	}

}
