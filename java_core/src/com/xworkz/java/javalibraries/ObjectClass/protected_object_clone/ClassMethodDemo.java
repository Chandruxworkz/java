package com.xworkz.java.javalibraries.ObjectClass.protected_object_clone;

public class ClassMethodDemo {
	public static void main(String[] args) {
		Soap santoor = new Soap("Santoor", 10.00, "Orange");
		Soap copyOfsantoor=null;
		try {
		 copyOfsantoor = santoor.copy();
	}catch(CloneNotSupportedException e) {
		e.printStackTrace();
	}
		System.out.println(santoor==copyOfsantoor);
		System.out.println(copyOfsantoor);
		System.out.println(santoor);
		

}
	
}