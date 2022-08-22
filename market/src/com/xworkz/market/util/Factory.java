package com.xworkz.market.util;



public class Factory {
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getFactory() {
		return factory;
	}
	static {
		factory=Persistence.createEntityManagerFactory("com.xworkz");
	}
	


}
