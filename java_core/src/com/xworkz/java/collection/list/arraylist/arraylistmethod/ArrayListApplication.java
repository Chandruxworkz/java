package com.xworkz.java.collection.list.arraylist.arraylistmethod;

import java.util.ArrayList;

public class ArrayListApplication {
	public static void main(String[] args) {
		Book classmate = new Book();
		classmate.setBrand("ClassMate");
		classmate.setPrice(30);
		classmate.setNoOfPages(100);
		
		Book arun = new Book();
		arun.setBrand("arun");
		arun.setPrice(40);
		arun.setNoOfPages(200);
		
		ArrayList<Book>books = new ArrayList<Book>();
		books.add(classmate);
		books.add(arun);
		System.out.println(books);
		
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getNoOfPages()==200) {
				System.out.println(books.get(i));
			}
		}
		for(Book book:books) {
			if(book.getNoOfPages()==100) {
				System.out.println(book);
			}
			
		}
	
	}

}
