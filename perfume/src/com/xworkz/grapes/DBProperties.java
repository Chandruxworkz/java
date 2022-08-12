package com.xworkz.grapes;

public enum DBProperties {

	URL("jdbc:mysql://localhost:3306/perfume"),USERNAME("root"),PASSWORD("Ajay@1234");
	
	
	String value;
	
	private DBProperties(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
