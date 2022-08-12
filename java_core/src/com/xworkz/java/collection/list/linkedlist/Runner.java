package com.xworkz.java.collection.list.linkedlist;

import java.util.*;

public class Runner {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		System.out.println("Objects insidse ArrayList: "+a1+"  Size:"+a1.size());
		System.out.println("-----------");
		
		LinkedList ll = new LinkedList();
		/*removeAll() is used to remove all the objects of one collection from another collection*/
		ll.addAll(a1);
		ll.add(30);
		System.out.println("Objects insidse LinkedList: "+ll+"  Size:"+ll.size());
		ll.removeAll(a1);
		System.out.println("------------");
		System.out.println("Objects insidse LinkedList: "+ll+"  Size:"+ll.size());

	}


}
