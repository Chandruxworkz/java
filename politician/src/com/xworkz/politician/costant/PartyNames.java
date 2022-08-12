package com.xworkz.politician.costant;

public enum PartyNames {
	
	BJP("Bjp"),CONGRESS("Congress"),JDS("Jds"),KJP("Kjp"),AAP("Aap"),SP("Sp"),AKALIDAL("Akali Dal"),KRS(" Krs"),BSP("Bsp"),AIAMDK("Aiamdsk");
	
	private String partyName;
	private PartyNames(String partyName) {
		this.partyName= partyName;
	}
	public String getPartyName() {
		return partyName;
	}
	public static PartyNames getByPartyName(String partyName) {
		PartyNames [] partyNames = PartyNames.values();
		for(PartyNames partyName2: partyNames) {
			if(partyName2.getPartyName().equals(partyName)) {
				return partyName2;
			}
		}
		return null;
	}
	

}
