package com.xworkz.java.collection.sets.SetsCustomExample.train.dao;

import com.xworkz.java.collection.sets.SetsCustomExample.train.dto.TrainDTO;

public interface TrainDAO {
	
	public void addTrain(TrainDTO traindto);
	public TrainDTO getTrainDetails(Integer trainNumber);
	public void updateTrainDetails(TrainDTO traindto);
	public void deleteTrain(TrainDTO traindto);
}


