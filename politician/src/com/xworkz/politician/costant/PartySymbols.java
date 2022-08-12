package com.xworkz.politician.costant;

public enum PartySymbols {
	
	LOTUS("Lotus"),PALM("Palm"),GRASS("Grass"),COCONUT("Coconut"),BROOM("Broom"),CYCLE("Cycle"),BALANCE("Balance"),ELEPHANT("Elephant"),VESSAL("Vessel"),LEAF("Leaf");
	private String partySybol;
	
	private PartySymbols(String partySybol) {
		this.partySybol=partySybol;
	}
	public String getPartySymbol() {
		return partySybol;
	}
	public static PartySymbols getPartySymbolById(String partySymbol) {
		PartySymbols[] partySymbols = PartySymbols.values();
		for(PartySymbols partySymbols2:partySymbols) {
			if(partySymbols2.getPartySymbol().equals(partySymbol)) {
				return partySymbols2;
			}
		}
		return null;
	}

}
