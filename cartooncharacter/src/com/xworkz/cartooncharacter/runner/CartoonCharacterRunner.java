package com.xworkz.cartooncharacter.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartooncharacter.dao.CartoonCharacterDAO;
import com.xworkz.cartooncharacter.dao.CartoonCharacterImpl;
import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;


public class CartoonCharacterRunner {
	public static void main(String[] args) {
		CartoonCharacterEntity entity1 = new CartoonCharacterEntity("BEN-10", "USA", "Male", 
				"Arpita", "Animation",
				"Sharan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity2 = new CartoonCharacterEntity("Chotabheem", "India", "Male", 
				"Bhoomi", "Cartoon",
				"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		CartoonCharacterEntity entity3 = new CartoonCharacterEntity("Mr_Bean", "USA", "Male", 
				"Sharat", "Cartoon",
				"Sharan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity4 = new CartoonCharacterEntity("Popaya seller man", "USA", "Male", 
				"Arpita", "Animation",
				"Shivanna", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity5 = new CartoonCharacterEntity("Dora the explorer", "England", "Female", 
				"Arpita", "Cartoon",
				"Hanuma", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity6 = new CartoonCharacterEntity("oggy and the cockroches", "USA", "Male", 
				"Arpita", "Animation",
				"Nandesh", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity7 = new CartoonCharacterEntity("krishna and balram", "USA", "Male", 
				"Arpita", "Animation",
				"Sachin", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity8 = new CartoonCharacterEntity("Doremon", "USA", "Male", 
				"Arpita", "Animation",
				"Nandan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity9 = new CartoonCharacterEntity("Barbie", "USA", "Female", 
				"C", "Animation",
				"Sharan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity10 = new CartoonCharacterEntity("Barbie the 12 dancing pricess", "USA", "Female", 
				"Arpita", "Animation",
				"Sharan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterDAO dao = new CartoonCharacterImpl();
		/*List<CartoonCharacterEntity> entities = new ArrayList();
		entities.add(entity1);
		entities.add(entity2);
		entities.add(entity3);
		entities.add(entity4);
		entities.add(entity5);
		entities.add(entity6);
		entities.add(entity7);
		entities.add(entity8);
		entities.add(entity9);
		entities.add(entity10);

		 dao.addAll(entities);*/
//	CartoonCharacterEntity	INF=dao.findByName("BEN-10");
//	System.out.println(INF);
//	CartoonCharacterEntity	x=dao.findByNameAndCountryAndGenderAndAuthor("Doremon", "USA", "Male", "Arpita");
//	System.out.println(x);
	String	y=dao.findAuthorByName("Doremon");
	System.out.println(y);
	}

}
