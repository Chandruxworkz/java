package com.xworkz.java.interface1.example1;

public class Ajay implements Person{
	//override
	public void eat()
	{
		System.out.println("Eating laddu");
	}
	public static void main(String[] args) {
		System.out.println(Person.id);
		Ajay a = new Ajay();
		
		a.eat();
	}
	
  
}
