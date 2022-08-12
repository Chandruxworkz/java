package com.xworkz.java.Constructor;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary)
	{
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
	void details()
	{
		System.out.println("Employee Name :"+name);
		System.out.println("Employee ID :"+id);
		System.out.println("Employee Salary :"+salary);
		System.out.println("---------------");
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(123,"Ajay",25000.98);
		Employee e2 = new Employee(456,"Shri",25000.05);
		Employee e3 = new Employee(789,"kohli",250000.05);
		
		System.out.println("Employee Details");
		System.out.println("*******************");
		e1.details();
		e2.details();
		e3.details();
	}
}
