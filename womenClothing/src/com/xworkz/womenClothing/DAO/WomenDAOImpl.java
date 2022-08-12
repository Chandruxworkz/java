package com.xworkz.womenClothing.DAO;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.womenClothing.entity.WomenEntity;

public class WomenDAOImpl implements WomenDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager=null;
	@Override
	public boolean save(WomenEntity entity) {
		
		try {

			
		 manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit(); 
		manager.close();	
		factory.close();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return true;
	}


	@Override
	public WomenEntity findById(int id) {
		
		try {
			
			 manager = factory.createEntityManager();
			
			WomenEntity entity=manager.find(WomenEntity.class, id);
			if(entity!=null) {
				System.out.println("id find :"+id);
				return entity;
			}else {
				System.err.println("not found"+id);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	


	@Override
	public void updatedLocationAndNameById(String newLocation, String newName, int id) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			WomenEntity entity = manager.find(WomenEntity.class, id);
			entity.setLocation(newLocation);
			entity.setName(newName);
			manager.merge(entity);
			tx.commit();
			
		}
		catch(PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		
	}


	@Override
	public WomenEntity deleteById(int id) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			WomenEntity entity = manager.find(WomenEntity.class, id);
		
			manager.remove(entity);
			tx.commit();
			
		}
		catch(PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		
		return null;
	}

}
