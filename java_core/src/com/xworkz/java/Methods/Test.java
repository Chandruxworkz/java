package com.xworkz.java.Methods;

public class Test {
	/* method without arguments and with return statement*/
	int display(){
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("Start");
		
		Test t = new Test();
				int result=t.display();
				System.out.println(t.display());
				System.out.println("End");
	}

}
