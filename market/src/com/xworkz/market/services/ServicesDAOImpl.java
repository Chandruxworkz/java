package com.xworkz.market.services;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.market.dao.MarketDAO;
import com.xworkz.market.dao.MarketImpl;
import com.xworkz.market.entity.MarketEntity;
import com.xworkz.market.util.Factory;

public class ServicesDAOImpl implements ServicesDAO {

	MarketDAO dao = new MarketImpl();
	
	
	ValidatorFactory factory = getFactory();
	@Override
	public Boolean save(MarketEntity entity) {
		public Boolean save(MarketEntity entity) {
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<MarketEntity>> violation = validator.validate(entity);
			if(violation.size() > 0) {
				
				System.out.println("Invalid Detais");
//	            for (ConstraintViolation<MarketEntity> violation2 : violation) {
//	                System.out.println(violation2.getMessage());
	        } else {
	            System.out.println("Valid Object");
	            dao.save(entity);
	        }
			return null;
		}

		
		}


		
	}
	
		

	
		
		
		
	}

}

