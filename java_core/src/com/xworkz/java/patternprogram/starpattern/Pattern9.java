package com.xworkz.java.patternprogram;

public class Pattern9 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
				
		for(int k=10;k>=i;k--)
		{
			System.out.print("*");
		}
		for(int l=9;l>=i;l--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
