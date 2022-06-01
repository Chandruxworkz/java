package com.xworkz.java.MethodOverriding;

public class MethodoveridingDemo {

	public static void main(String[] args) {
    RBI R = new RBI();
    SBI S = new SBI();
    ICICI I = new ICICI();
    R.interestRate();
	S.interestRate();
    I.interestRate();
}
}