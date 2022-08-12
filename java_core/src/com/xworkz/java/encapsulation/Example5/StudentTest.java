package com.xworkz.java.encapsulation.Example5;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Age");
		int age = scan.nextInt();
		s.setAge(age);
		System.out.println(s.getAge());
	}

}
