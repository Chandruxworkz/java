package com.xworkz.java.exceptionhandling.customexception.checkedexception.example1;

public class AtmMachineTest {
	public static void main(String[] args) {
		
	
	AtmMachine atmMachine = new AtmMachine();
	int amount = 50;
	try {
     atmMachine.draw(amount);
	}
	catch(AtmException e){
		if(amount>50000){
			System.out.println(e);
		}
		else {
			System.out.println(e.getMessage());
		}

	}
}
}
