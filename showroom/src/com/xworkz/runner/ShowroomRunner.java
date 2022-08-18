package com.xworkz.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.showroom.entity.ShowroomEntity;
import com.xworkz.showroomDAO.ShowroomDAO;
import com.xworkz.showroomDAO.ShowroomImpl;

public class ShowroomRunner {
	public static void main(String[] args) {
	
	ShowroomEntity showroomEntity =new 	ShowroomEntity();
	showroomEntity.setId(1);
	showroomEntity.setName("Pulsar Showroom");
	showroomEntity.setLocation("Shivamogga");
	showroomEntity.setOpeaningTime(LocalTime.of(10, 00));
	showroomEntity.setClosingTime(LocalTime.of(12, 00));
	showroomEntity.setCreatedBy("Ajinkya");
	showroomEntity.setCreatedDate(LocalDate.now());
	showroomEntity.setUpdatedBy("Ravi");
	showroomEntity.setUpdatedDate(LocalDate.now());


	showroomEntity.setId(2);
	showroomEntity.setName("Honda ShowRoom");
	showroomEntity.setLocation("Bangalore");
	showroomEntity.setOpeaningTime(LocalTime.of(11, 00));
	showroomEntity.setClosingTime(LocalTime.of(10, 00));
	showroomEntity.setCreatedBy("Darshan");
	showroomEntity.setCreatedDate(LocalDate.now());
	showroomEntity.setUpdatedBy("Manoj");
	showroomEntity.setUpdatedDate(LocalDate.now());


	showroomEntity.setId(3);
	showroomEntity.setName("KTM Showroom");
	showroomEntity.setLocation("Mangalore");
	showroomEntity.setOpeaningTime(LocalTime.of(9, 00));
	showroomEntity.setClosingTime(LocalTime.of(9, 00));
	showroomEntity.setCreatedBy("Vikrant");
	showroomEntity.setCreatedDate(LocalDate.now());
	showroomEntity.setUpdatedBy("Jimmy");
	showroomEntity.setUpdatedDate(LocalDate.now());

	ShowroomDAO dao = new ShowroomImpl();
	boolean saved =dao.save(showroomEntity);
	System.out.println(saved);

}
}