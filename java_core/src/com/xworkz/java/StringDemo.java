package com.xworkz.java;

import java.nio.charset.Charset;

public class StringDemo {
	public static void main(String[] args) {
		
		String str=new String();
		System.out.println(str.length());
		
		String s1=new String("chandru");
		System.out.println(s1+s1.length());
		
		StringBuffer s2=new StringBuffer("Dyamanna");
		String str1=new String(s2);
		System.out.println(str1);
		
		StringBuilder builder=new StringBuilder("Nandish Channal");
		String str3=new String(builder);
		System.out.println(str3+" "+str3.length());
		
		byte[] b= {101,102,103};
		String str4=new String(b);
		System.out.println(str4);//efg
		
		char value[]= {'a','b','c','d'};
		String str5=new String(value);
		System.out.println(str5);
		
		char value1[]= {'a','b','c','d','e','f','g'};
		String str6=new String(value1,3,1);
		System.out.println(str6);// c
	
		byte[] bs= {65,66,67,68,69,70,71};
		String s3=new String(bs,3,4);
		System.out.println(s3);
		
		byte[] de= {65,66,67,68,69,70,71};
		String d=new String(de,Charset.forName("ISO-8859-1"));
		System.out.println(d);
		
		byte[] bytes= {65,66,67,68,69,70,71};
		String e=new String(bytes,4,3,Charset.forName("ISO-8859-1"));
		System.out.println(e);
	}
}

