package com.xworxz.resort.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworxz.resort.entity.ResortEntity;

public class resortDAOImpl implements ResortDAO {

	@Override
	public boolean save(ResortEntity resortEntity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(resortEntity);
		tx.commit(); 
		manager.close();	
		factory.close();
		return true;
	}

}
