package com.xworkz.java.javalibraries.ObjectClass.hashcodemethod;

    public class Window {
	public static void main(String[] args) {
		Window e = new Window();
		System.out.println("Hash Code :"+e.hashCode());
	}
	@Override
	public int hashCode() {
		System.out.println("Hash code overridden");
		return 1;
	}
	

}
