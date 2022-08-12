package com.xworkz.java.javalibraries.ObjectClass.storingObject;

public class Student {
	int age;
	String name;
	
	Student(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		
	Student s1 = new Student(21, "Dinga");
	Student s2 = new Student(22, "Tim");
	Student s3 = new Student(23, "Dingi");
	
	Student[] s = new Student[3]; //Array of type student
	
	s[0] = s1;
	s[1] = s2;
	s[2] = s3;
	for(int i=0; i<s.length; i++) {
		System.out.println(s[i]);
		System.out.println(s[i].age+" "+s[i].name);
	}
			
	

}
}
