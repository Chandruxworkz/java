package com.xworkz.java.array.example3;

public class Alphabet {
	public static void main(String[] args) {
		char[] arr = new char[26];
		char alp = 'A';
		for(int i=0;i<arr.length;i++) {
			arr[i] = alp;
					alp++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

}
}
