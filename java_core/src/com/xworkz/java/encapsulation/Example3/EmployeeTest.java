package com.xworkz.java.encapsulation.Example3;

public class EmployeeTest {
	public static void main(String[] args) {
      Employee e = new Employee();
       System.out.println("Id :"+e.getId());
       System.out.println("Name :"+e.getName());
       System.out.println("----------");
         //Accept using scanner class.
       e.setId(77);
       e.setName("Ajay");
       System.out.println("Id :"+e.getId());
       System.out.println("Name :"+e.getName());
       
	}
}
