package com.xworkz.java.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(30);
		l.add(40);
		l.add(10);
		l.add(20);
		
		System.out.println("Before Sorting");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("After Sorting");
		Collections.sort(l);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
			
		}
	}

}
