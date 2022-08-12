package com.xworkz.politician.runner;

import com.xworkz.politician.costant.PartyNames;
import com.xworkz.politician.costant.PartySymbols;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;
import com.xworkz.politician.dto.PoliticianDTO;

public class Runner {
	public static void main(String[] args) {
		PoliticianDTO politicianDTO1 = new PoliticianDTO(1, "B S Yadiyurappa", PartyNames.BJP, "Bagalkot", 60000,
				10000000d, "Amit Shah", "Delhi", PartySymbols.LOTUS);
		PoliticianDTO politicianDTO2 = new PoliticianDTO(2, "Siddaramayya", PartyNames.CONGRESS, "Badami", 50000,
				15000000d, "Rahul Gandhi", "Mumbai", PartySymbols.PALM);
		PoliticianDTO politicianDTO3 = new PoliticianDTO(3, "H D Kumarswamy", PartyNames.JDS, "Mandya", 65000,
				23000000d, "H D Devegowda", "Karnataka", PartySymbols.GRASS);
		PoliticianDTO politicianDTO4 = new PoliticianDTO(4, "B Y Raghavendra", PartyNames.KJP, "Shivamogga", 75000,
				100000d, "Halappa", "Andra Pradesh", PartySymbols.COCONUT);
		PoliticianDTO politicianDTO5 = new PoliticianDTO(5, "Aravind kejrival", PartyNames.AAP , "Dehli", 60000,
				30000000d, "Desodia", "Delhi South", PartySymbols.BROOM);
		PoliticianDTO politicianDTO6 = new PoliticianDTO(6, "Akilesh Yadav", PartyNames.SP, "Lakhimpur Keri", 87000,
				10000000d, "Mulayalam Singh Yadav", "Uttar Pradesh", PartySymbols.CYCLE);
		PoliticianDTO politicianDTO7 = new PoliticianDTO(7, "Y P singh", PartyNames.AKALIDAL, "Amritsar", 50000,
				400000d, "L P Singh", "Punjab", PartySymbols.BALANCE);
		PoliticianDTO politicianDTO8 = new PoliticianDTO(8, "Ravi", PartyNames.KRS, "Chennapattana", 89000,
				100000d, "Anup Kumar", "Tamilnad", PartySymbols.VESSAL);
		PoliticianDTO politicianDTO9 = new PoliticianDTO(9, "Chellanna Swamy", PartyNames.AIAMDK, "Kochhi", 45000,
				7856000000d, "t raman", "Chennai", PartySymbols.LEAF);
		PoliticianDTO politicianDTO10 = new PoliticianDTO(10, "Mayavati", PartyNames.BSP, "", 55000,
				549000d, "Y p yadav", "Madhya Pradesh", PartySymbols.ELEPHANT);

		PoliticianDAO politicianDAO = new PoliticianDAOImpl();
		politicianDAO.save(politicianDTO1);
		politicianDAO.save(politicianDTO2);
		politicianDAO.save(politicianDTO3);
		politicianDAO.save(politicianDTO4);
		politicianDAO.save(politicianDTO5);
		politicianDAO.save(politicianDTO6);
		politicianDAO.save(politicianDTO7);
		politicianDAO.save(politicianDTO8);
		politicianDAO.save(politicianDTO9);
		politicianDAO.save(politicianDTO10);
		System.out.println("==============================================================================================================================");
		PoliticianDTO y=politicianDAO.findById(9);
		System.out.println(y);
		System.out.println("==============================================================================================================================");
		PoliticianDTO z=politicianDAO.findByIdAndPresident(10,"Y p yadav");
		System.out.println(z);
		System.out.println("===============================================================================================================================");
		PoliticianDTO a =politicianDAO.findByIdAndNameAndPresident(5, "Aravind kejrival", "Desodia");
		System.out.println(a);
		System.out.println("================================================================================================================================");
		PoliticianDTO b =politicianDAO.findByIdAndName(1,"B S Yadiyurappa");
		System.out.println(b);




	}

}
