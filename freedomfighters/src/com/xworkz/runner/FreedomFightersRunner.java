package com.xworkz.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighters.dao.FreedomFighterDAO;
import com.xworkz.freedomfighters.dao.FreedomFightersImpl;
import com.xworkz.freedomfighters.entity.FreedomFightersEntity;

public class FreedomFightersRunner {
	public static void main(String[] args) {
		FreedomFightersEntity entity1 = new FreedomFightersEntity("Bhagat Singh", "Punjab", LocalDate.now(),
				LocalDate.now(), "Chandru", LocalDate.now(), "Sachin", LocalDate.now());
		FreedomFightersEntity entity2 = new FreedomFightersEntity("Sangolli Rayanna", "Belagavi", LocalDate.now(),
				LocalDate.now(), "Manohar", LocalDate.now(), "Sharan", LocalDate.now());
		FreedomFightersEntity entity3 = new FreedomFightersEntity("Bhagat Singh", "Punjab", LocalDate.now(),
				LocalDate.now(), "Manoj", LocalDate.now(), "kalyan", LocalDate.now());

		FreedomFighterDAO dao = new FreedomFightersImpl();
		List<FreedomFightersEntity> entities = new ArrayList<FreedomFightersEntity>();
		entities.add(entity1);
		entities.add(entity2);
		entities.add(entity3);

		Boolean save = dao.addAll(entities);
		System.out.println(save);
	}

}
