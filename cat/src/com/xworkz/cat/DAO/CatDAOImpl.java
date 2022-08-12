package com.xworkz.cat.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.cat.entity.CatEntity;

public class CatDAOImpl implements CatDAO{

	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager=null;
	
	
	@Override
	public boolean save(CatEntity entity) {
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
	public CatEntity findById(int id) {
		try {
			
			 manager = factory.createEntityManager();
			
			CatEntity entity=manager.find(CatEntity.class, id);
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
	public void updatedBreedAndNameById(String newLocation, String newName, int id) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			CatEntity entity = manager.find(CatEntity.class, id);
			entity.setBreed(newLocation);
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
	public CatEntity deleteById(int id) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			CatEntity entity = manager.find(CatEntity.class, id);
		
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
