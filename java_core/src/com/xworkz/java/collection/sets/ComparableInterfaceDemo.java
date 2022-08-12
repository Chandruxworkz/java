package com.xworkz.java.collection.sets;

import java.util.TreeSet;

public class ComparableInterfaceDemo {
	public static void main(String[] args) {
		
		TreeSet<Student> students = new TreeSet<Student>(new StudentComparator());
		
		
		Student arjun = new Student();
		arjun.setId(1);
		arjun.setName("Arjun");
		
		Student nandish = new Student();
		nandish.setId(2);
		nandish.setName("Nandish");
		
		Student arpita = new Student();
		arpita.setId(3);
		arpita.setName("arpita");
		
		Student sharan = new Student();
		sharan.setId(4);
		sharan.setName("Sharan");
		
		Student bhoomikha  = new Student();
		arjun.setId(5);
		arjun.setName("Bhoomika");
		
		students.add(bhoomikha);
		students.add(arjun);
		students.add(sharan);
		students.add(arpita);
		students.add(nandish);
		
		
		System.out.println(students);
		
	}

}
