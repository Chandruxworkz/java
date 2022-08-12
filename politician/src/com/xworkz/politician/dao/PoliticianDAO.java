package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDTO;
public interface PoliticianDAO {
	
	public Boolean save(PoliticianDTO politicianDTO);
	  PoliticianDTO findById(int id);
	  PoliticianDTO findByIdAndPresident(Integer id, String president);
		PoliticianDTO findByIdAndNameAndPresident(Integer id, String name, String president);
		PoliticianDTO findByIdAndName(Integer id, String name);
		String findNameById(Integer id);


	

}
 