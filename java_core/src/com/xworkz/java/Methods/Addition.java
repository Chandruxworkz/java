package com.xworkz.java.Methods;

public class Addition
{
	/* Method With Arguments and Without return Statement*/
void add(int a,int b)
{
	int sum = a+b;
	System.out.println("Sum of "+a+" and "+b+" is "+sum);
}
public static void main(String[] args) {
	Addition A = new Addition();
	A.add(79, 70);
	A.add(6, 8);
}
}
