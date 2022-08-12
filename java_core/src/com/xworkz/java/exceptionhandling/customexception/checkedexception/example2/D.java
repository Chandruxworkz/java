package com.xworkz.java.exceptionhandling.customexception.checkedexception.example2;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class D {
	public static void main(String[] args) {
		try {
		FileReader f = new FileReader("demo.download");
	}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}

}
}
//File not Found Exception-->checked Exception