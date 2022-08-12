package com.xworkz.java.patternprogram.numberpattern;

public class NumberPattern9 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
				
		for(int k=10;k>=i;k--)
		{
			System.out.print(k);
		}
		for(int l=9;l>=i;l--)
		{
			System.out.print(l);
		}
		System.out.println();
		}
	}


}
