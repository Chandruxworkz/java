package com.xworkz.cartooncharacter.dao;

import static com.xworkz.cartooncharacter.util.Factory.getFactory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;


public class CartoonCharacterImpl implements CartoonCharacterDAO {
	EntityManagerFactory factory = getFactory();

	@Override
	public boolean addAll(List<CartoonCharacterEntity> entities) {
		
		EntityManager manager = null;
		try {
			manager=factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			System.out.println("hai");
			tx.begin();
			for (CartoonCharacterEntity cartoonCharacterEntity : entities) {

				manager.persist(cartoonCharacterEntity);
				
			}
			tx.commit();
		
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return false;
	}

	@Override
	public CartoonCharacterEntity findByName(String name) {
	EntityManager manager	=factory.createEntityManager();
	try {
	Query query=manager.createNamedQuery("findAuthorByName");
	query.setParameter("an", name);
	Object obj=query.getSingleResult();
	//System.out.println("manoj1");
	if(obj!=null) {
		//System.out.println("manoj2");
		CartoonCharacterEntity cartoonCharacterEntity=(CartoonCharacterEntity)obj;
		return cartoonCharacterEntity;
	}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		manager.close();
	}
		return null;
	}

	@Override
	public CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = factory.createEntityManager();
		try {
		Query query	= manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
		query.setParameter("nm", name);
		Object obj=query.getSingleResult();
		if(obj!=null){
			CartoonCharacterEntity cartoonCharacterEntity=(CartoonCharacterEntity)obj;
			return cartoonCharacterEntity;
		}
			{
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	
	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
		Query query	= manager.createNamedQuery("findAuthorByName");
		query.setParameter("an", name);
		Object obj= query.getSingleResult();
		if(obj!=null){
			String cartoon =(String)obj ;
			return cartoon;
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}
}



