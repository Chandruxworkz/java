package com.xworkz.java.collection.sets.SetsCustomExample.train.service;

import com.xworkz.java.collection.sets.SetsCustomExample.train.dto.TrainDTO;

public interface TrainServices {
	public void addTrain(TrainDTO traindto);
	public TrainDTO getTrainDetails(Integer trainNumber);
	public void updateTrainDetails(TrainDTO traindto);
	public void deleteTrainDetails(TrainDTO traindto);

}
