package com.xworkz.java.instanceof1.example3;

public class Hotel {
Food orderFood(int choice) {
	if(choice == 1)
	{
		Idly i = new Idly();
		return i;
	}
	else if(choice == 2) 
	{
		Dosa d = new Dosa();
		return d;
	}
	else
	{
		Vada v = new Vada();
		return v;
	}
 }

}
