package com.xworkz.java.Methods;

public class MethodDemo {
	/* Method without argument and without return statement(method is not returning anything)*/
          void display()
           {
        	   System.out.println("Hello world..!");
           }
          public static void main(String[] args) {
			System.out.println("Start");
			MethodDemo d = new MethodDemo();
			d.display();//calling or invoking
		System.out.println("End");
			
		}

}
