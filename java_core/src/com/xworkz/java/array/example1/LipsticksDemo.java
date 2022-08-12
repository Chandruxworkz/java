package com.xworkz.java.array.example1;

public class LipsticksDemo {
	public static void main(String[] args) {
		
	
	Lipstick lakme = new Lipstick("Lakme", "Black", 10.00);
	Lipstick mac = new Lipstick("Mac", "Pink", 5.00);
	Lipstick myglamm = new Lipstick("Myglamm", "Green", 1.00);
	Lipstick sugar = new Lipstick("Sugar", "Yellow", 3.00);
	Lipstick maybeline = new Lipstick("Maybelline","yellow", 350);
     
	Lipstick[] lipsticks = {lakme,mac,myglamm,sugar,maybeline};
	for (int i = 0; i < lipsticks.length; i++) {
		if(lipsticks[i].price>=10) {
		System.out.println(lipsticks[i]);
		
	}
	
}
}
}
