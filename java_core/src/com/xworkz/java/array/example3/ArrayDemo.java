package com.xworkz.java.array.example3;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[100];
//		  arr[0] = 1;
//		  arr[1] = 2;
//		  arr[2] = 3;
//		  arr[3] = 4;
//	System.out.println(arr[0]);
//	System.out.println(arr[1]);
//	System.out.println(arr[2]);
//	System.out.println(arr[3]);
		int num = 1;
		for(int i=0;i<arr.length;i++) {
			arr[i] = num;
					num++;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	

	}
}
