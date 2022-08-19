package com.xworkz.cartooncharacter.dao;

import java.time.LocalDate;
import java.util.List;

import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;

public interface CartoonCharacterDAO {
	boolean addAll(List<CartoonCharacterEntity> entities);

	CartoonCharacterEntity findByName(String name);

	CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author);
	 String findAuthorByName(String name) ;
	 Object[] findNameAndCountryByAuthor(String author);
	 LocalDate findCreatedDateByAuthor(String author);
	 void updateAuthorByName(String newAuthor,String name);
	 

	 
	 
	 List<CartoonCharacterEntity>findAllByAuthor(String Author);
	 List<CartoonCharacterEntity> findAllByAuthorAndGender(String author,String gender);
	 List<String> findAllCountry();
	 List<Object> findAllNameAndCountry();
	 List<String> findAllName();
	 List<CartoonCharacterEntity> findAll();
	// List<Object[]> findAllNameAndCountryAndAuthor();
	 
	 void updateTypeByName(String name,String type);
	 void deleteByName(String name);
	 
	 


}
