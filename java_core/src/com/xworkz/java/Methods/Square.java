package com.xworkz.java.Methods;

public class Square {
	/* Method with arguments with return statement*/
	int findSquare(int n)
	{
		return n*n;
	}

	public static void main(String[] args) {
	Square S = new Square();
	int result=S.findSquare(5);
System.out.println(S.findSquare(5));
}
}
