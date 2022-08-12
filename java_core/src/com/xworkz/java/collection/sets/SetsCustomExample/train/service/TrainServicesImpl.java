package com.xworkz.java.collection.sets.SetsCustomExample.train.service;

import com.xworkz.java.collection.sets.SetsCustomExample.train.dao.TrainDAO;
import com.xworkz.java.collection.sets.SetsCustomExample.train.dao.TrainDAOImpl;
import com.xworkz.java.collection.sets.SetsCustomExample.train.dto.TrainDTO;

public class TrainServicesImpl implements TrainServices{
	TrainDAO trainDAO = new TrainDAOImpl();
	

	public void addTrain1(TrainDTO traindto) {
		 Integer modelNumber = traindto.getNumber();
		 int count = 0;
		 if(modelNumber != null) {
			 count++;
		 }
		 if(count > 0) {
		    trainDAO.addTrain(traindto);
		 }
		 else {
			 System.out.println("Your Details Entered Did Not Match The Standard ");
		 }
	}


	@Override
	public TrainDTO getTrainDetails(Integer trainNumber) {
		return trainDAO.getTrainDetails(trainNumber);
	}

	@Override
	public void updateTrainDetails(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainDetails(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addTrain(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}
	}





