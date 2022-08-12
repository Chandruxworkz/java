package com.xworkz.politician.dto;

import com.xworkz.politician.costant.PartyNames;
import com.xworkz.politician.costant.PartySymbols;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PoliticianDTO {
	
	private Integer id;
	private String name;
	private PartyNames partyName;
	private String partyOfficeLocation;
	private Integer totalMembers;
	private Double partyBudget;
	private String president;
	private String headquarter;
	private PartySymbols partySymbol;

}
