package com.xworkz.java.patternprogram.numberpattern;

public class NumerPattern5 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
				
		for(int k=4;k>=i;k--)
		{
			System.out.print(k);
		}
		System.out.println();
		}
	}
}
