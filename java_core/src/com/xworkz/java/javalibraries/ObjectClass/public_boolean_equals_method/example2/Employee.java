package com.xworkz.java.javalibraries.ObjectClass.public_boolean_equals_method.example2;

public class Employee {
	int id;
	double height;
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.id == e.id && this.height == e.height;
	}

	Employee(int id, double height) {
		this.id = id;
		this.height = height;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(100, 5.6);
		Employee e2 = new Employee(101, 5.6);
		System.out.println(e1.equals(e2));
		System.out.println("******");
		System.out.println(new Employee(21,5.5).equals(new Employee(21,5.5)));
		System.out.println("********");
		if(e1.equals(e2)) {
			System.out.println("Contents are Same");
		}
		else {
			System.out.println("Contents are different");
		}
	}

}
