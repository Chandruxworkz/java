package com.xworkz.java.encapsulation.Example5;

public class Student {
	private int age;
	public void setAge(int age) {
		if(age>0) {
			System.out.println("Age get initialized");
			this.age = age;
		}
		else {
			System.out.println("Age cannot be initialized");
		}
	}
		public int getAge() {
			return this.age;
		}
	}
	


