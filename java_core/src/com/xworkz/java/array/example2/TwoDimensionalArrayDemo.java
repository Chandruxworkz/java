package com.xworkz.java.array.example2;

public class TwoDimensionalArrayDemo {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
		System.out.println(arr[i][j]);
	}

}
	}
}
