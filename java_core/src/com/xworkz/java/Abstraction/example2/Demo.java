package com.xworkz.java.Abstraction.example2;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Enter Choice: ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Hai Dinga");
			break;
			
		case 2:
			System.out.println("Bye Dinga");
			break;
		case 3:
			System.out.println("Thank you");
			System.exit(0);
			
		default:
			System.out.println("Invalid");
		}
		System.out.println("--------------");
	}
}
}
			
/*switch(choice) {
		case 1:
			System.out.println("Hai Dinga");
			break;
			
		case 2:
			System.out.println("Bye Dinga");
			break;
			
		default:
			System.out.println("Invalid");
		
 O/p
Enter Choice: 
1
Hai Dinga
Enter Choice: 
2
Bye Dinga
Enter Choice: 
23
Invalid

*/


				
		