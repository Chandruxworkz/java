package com.xworkz.job.constants;

public enum Qualification {

	BE("BE"),BCA("BCA"),BSC("BSC"),MBA("MBA");
	
	private String val;
	
	private Qualification(String val) {
		this.val=val;
	}
	
	

	public String getQualification() {
		return val;
	}
	
	
}
