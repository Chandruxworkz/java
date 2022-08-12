package com.xworkz.java.collection.list.linkedlist;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		
	ArrayList l = new ArrayList();
	
	l.add(10);
	l.add(20);
	l.add(30);
	
	System.out.println(l);//[10,20,30]
	
	//add() is used to add an object based on the index position
	//already existing object gets shifted to the next position
	l.add(1, 50);
	
	System.out.println(l);//[10,50,20,30]
	
	//set() is used to add an object based on the index position
	//already existing object gets overridden
	
	l.set(2, 70);
	System.out.println(l);//[10, 50, 70, 30]
	}
}
