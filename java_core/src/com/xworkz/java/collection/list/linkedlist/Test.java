package com.xworkz.java.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		System.out.println("Objects insidse ArrayList: "+a1+"  Size:"+a1.size());
		System.out.println("-----------");
		
		LinkedList ll = new LinkedList();
		/*addAll() is used to add all the objects of one collection into another collection.*/
		ll.addAll(a1);
		ll.add(30);
		System.out.println("Objects insidse LinkedList: "+ll+"  Size:"+ll.size());
	}

}
