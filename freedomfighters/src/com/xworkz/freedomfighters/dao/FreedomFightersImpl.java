package com.xworkz.freedomfighters.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.freedomfighters.entity.FreedomFightersEntity;
import static com.xworkz.freedomfighters.util.Factory.*;

public class FreedomFightersImpl implements FreedomFighterDAO {
	EntityManagerFactory factory = getFactory();
	

	@Override
	public boolean addAll(List<FreedomFightersEntity> entities) {
		EntityManager manager = null;
		try {
			manager=factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (FreedomFightersEntity fightersEntity : entities) {

				manager.persist(fightersEntity);
			}
			tx.commit();
		
			
		}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		finally {
			manager.close();
		}
		return true;


}
}
