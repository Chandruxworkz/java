package com.xworkz.company.DAO;

import com.xworkz.Entity.CompanyEntity;

public interface CompanyDAO {
	Boolean save(CompanyEntity entity);
	CompanyEntity findById(Integer id);
	void updateNameAndCreatedBYBYId(String name,String createdBy,Integer id);
	void deleteById(Integer id);

}
