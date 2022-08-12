package com.xworkz.java.collection.list.arraylist.example1;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20.45);
		l.add(10);
		l.add(null);
		l.add("java");
		System.out.println(l);
		
		System.out.println("---------------");
		/*size() is used to return to the length of collection */
		System.out.println(l.size());
		
		System.out.println("----------------");
		/* get() is used to return the object based on the index position*/
		System.out.println(l.get(2));
		//System.out.println(l.get(250));IndexOutOfBondException
		System.out.println("-----------------");
		/*contains() is used to check if the object is present in the collection or not*/
		System.out.println(l.contains("java"));
		System.out.println(l.contains("Java"));
		System.out.println("------------------");
		
		System.out.println(l);
		/*remove is used to remove an object based on the index position*/
		l.remove(2);
		System.out.println(l);
		System.out.println("-------------------");
		
		/*isEmpty() is used to check if the collection is Empty or not*/
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println("======================");
		
		ArrayList x = new ArrayList();
		
		x.add(20);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(60);
		
		System.out.println(x);
		System.out.println("--------------------");
		
		/*indexOf() is used to find the index position of an object and first occurence in case of duplication*/
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(30));
		System.out.println(x.indexOf(100));//-1 if the object is not present
		System.out.println("----------------------");
		
		/*lastIndexOf() is used to find the last index position of an object*/
		System.out.println(x.lastIndexOf(10));
		
	}

}
