package com.xworkz.java.string;

public class StringTest {
	public static void main(String[] args) {
		
	
	String name = " Darshan Gowda";
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.codePointAt(2));
	System.out.println(name.length());
	System.out.println(name.startsWith("dar"));
	System.out.println(name.startsWith("Dar"));
	System.out.println("***************");
	System.out.println(name.contains("han"));
	System.out.println(name.contains("rsh"));
	System.out.println(name.contains("dar"));
	System.out.println(name.charAt(3));
	System.out.println(name.indexOf("D"));
	System.out.println(name.indexOf("a"));
	System.out.println(name.substring(7));
	System.out.println(name.lastIndexOf('D'));
	System.out.println(name.replace('D', 'a'));
	System.out.println(name.split("Darshan"));
	String name1 = "Dinga";
	System.out.println(name1.concat(name));
	System.out.println();
	String s1 = new String("You cannot Change Me");
	String s2 = new String("You cannot Change Me");m.out.println((s2));
	String s3 = "you cannot change me";
	System.out.println(s1==s3);
	String s4= "you cannot change me";
	System.out.println(s3==s4);
	String s5 = "you cannot "+"change me";
	System.out.println(s4==s5);
	String s6 ="you cannot";
	String s7 =s6+"change me";
	System.out.println(s4==s7);
	final String s8 = "you cannot";
	String s9 = s8+" change me";
	System.out.println(s4==s9);
	
	

}
}
