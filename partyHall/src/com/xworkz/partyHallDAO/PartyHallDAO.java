package com.xworkz.partyHallDAO;

import com.xworkz.partyHall.Entity.PartyHallEntity;

public interface PartyHallDAO {
	Boolean save(PartyHallEntity entity);

	PartyHallEntity findById(Integer id);
	
	void updateNameAndCreatedByById(String name, String createdBy, Integer id);
	
	void deleteById(Integer id);

}
