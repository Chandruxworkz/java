package com.xworkz.java.exceptionhandling.throwskeyword.example1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example {
	void readData() throws FileNotFoundException
	{
		FileReader f = new FileReader("dinga.txt");
	}
	public static void main(String[] args) {
		Example e = new Example();
		try {
			e.readData();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("File not present");
		}
	}

}
