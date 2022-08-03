package com.xworkz.job.constants;

public enum JobDesignation {
	
	SOFTWAREDEVELOPER("developer"),SOFTWARETESTER("tester"),MANAGER("reporting manager"),TEAMLEAD("TL"),ARCHITECT("head");
	
	private String value;
	
	private JobDesignation(String value) {
		this.value=value;
	}
	
	

	public String getDesignation() {
		// TODO Auto-generated method stub
		return value;
	}

}
