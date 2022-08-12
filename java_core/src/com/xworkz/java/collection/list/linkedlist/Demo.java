package com.xworkz.java.collection.list.linkedlist;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		
		System.out.println("------------");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("------------");
		for (int i = l.size()-1; i >=0; i--) {
			System.out.println(l.get(i));
			System.out.println("-----------");
		}
		int x[] = {10,20,30};
		System.out.println(x.length);
		
		String y = "java";
		System.out.println(y.length());
		
		
	}

}
