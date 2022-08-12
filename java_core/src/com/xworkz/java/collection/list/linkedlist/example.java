package com.xworkz.java.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class example {
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
		System.out.println("--------------------------");
		System.out.println("Object inside linkedlist: "+ll+"  size:"+ll.size());
		
		/*containsAll() is used to check if all the objects of one collection is present inside another collection or not.*/
		System.out.println(ll.containsAll(a1));//true
		
		ll.remove(1);
		
		System.out.println("Object inside linkedlist: "+ll+"  size:"+ll.size());
		
		
	}


}
