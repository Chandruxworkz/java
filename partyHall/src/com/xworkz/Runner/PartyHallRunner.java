package com.xworkz.Runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.partyHall.Entity.PartyHallEntity;
import com.xworkz.partyHallDAO.PartyHallDAO;
import com.xworkz.partyHallDAO.PartyHallImpl;

public class PartyHallRunner {
	public static void main(String[] args) {


		PartyHallEntity partyHallEntity=new PartyHallEntity();
		partyHallEntity.setId(1);
		partyHallEntity.setName("Dwarka Hall");
		partyHallEntity.setLocation("Shivamogga");
		partyHallEntity.setOpeaningTime(LocalTime.of(10, 00));
		partyHallEntity.setClosingTime(LocalTime.of(12, 00));
		partyHallEntity.setCreatedBy("Ajinkya");
		partyHallEntity.setCreatedDate(LocalDate.now());
		partyHallEntity.setUpdatedBy("Ravi");
		partyHallEntity.setUpdatedDate(LocalDate.now());


		partyHallEntity.setId(2);
		partyHallEntity.setName("Studd");
		partyHallEntity.setLocation("Bangalore");
		partyHallEntity.setOpeaningTime(LocalTime.of(11, 00));
		partyHallEntity.setClosingTime(LocalTime.of(10, 00));
		partyHallEntity.setCreatedBy("Darshan");
		partyHallEntity.setCreatedDate(LocalDate.now());
		partyHallEntity.setUpdatedBy("Manoj");
		partyHallEntity.setUpdatedDate(LocalDate.now());


		partyHallEntity.setId(3);
		partyHallEntity.setName("Dimond Hall");
		partyHallEntity.setLocation("Mangalore");
		partyHallEntity.setOpeaningTime(LocalTime.of(9, 00));
		partyHallEntity.setClosingTime(LocalTime.of(9, 00));
		partyHallEntity.setCreatedBy("Vikrant");
		partyHallEntity.setCreatedDate(LocalDate.now());
		partyHallEntity.setUpdatedBy("Jimmy");
		partyHallEntity.setUpdatedDate(LocalDate.now());

		PartyHallDAO dao = new PartyHallImpl();
		boolean saved =dao.save(partyHallEntity);
		System.out.println("Saved");

		PartyHallEntity entity=dao.findById(1);
		System.out.println(entity);

		dao.updateNameAndCreatedByById("Maharaja convention hall", "Malatesh", 2);


		dao.deleteById(2);

	}
}
