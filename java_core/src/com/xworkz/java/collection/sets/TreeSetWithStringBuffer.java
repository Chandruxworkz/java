package com.xworkz.java.collection.sets;

import java.util.TreeSet;

public class TreeSetWithStringBuffer {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<StringBuffer>();
		ts.add(new StringBuffer("1"));
		ts.add(new StringBuffer("2"));
		ts.add(new StringBuffer("3"));
		ts.add(new StringBuffer("4"));
		ts.add(new StringBuffer("5"));
		
		System.out.println(ts);
	}

}
