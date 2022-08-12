package com.xworkz.java.interface1.example3;

public class Employee extends TestYantra implements TATA,Infosys{
	//@Override
	public void develop() {
		System.out.println("Developing App");
	}
	//@Override
	public void test() {
		System.out.println("Testing App");
	}
	//optionally we can override work()
	public static void main(String[] args) {
		Employee e = new Employee();
		e.develop();
		e.test();
		e.work();
	}
}
