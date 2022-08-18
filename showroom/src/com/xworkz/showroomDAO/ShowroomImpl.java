package com.xworkz.showroomDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.showroom.entity.ShowroomEntity;

public class ShowroomImpl implements ShowroomDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");


	@Override
	public Boolean save(ShowroomEntity entity) {
	
			EntityManager manager = factory.createEntityManager();
			try {

				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				manager.persist(entity);
				tx.commit();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				manager.close();

			}
			return true;
	}

}
