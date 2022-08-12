package com.xworkz.homestay.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.homestay.entity.HomestayEntity;

public class HomestayImpl implements HomestayDAO{

	@Override
	public boolean save(HomestayEntity entity) {
		try {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		manager.close();
		manager.close();
		}catch(PersistenceException exception) {
			exception.printStackTrace();
		}
		
		return true;
	}

}
