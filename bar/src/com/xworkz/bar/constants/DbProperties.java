package com.xworkz.bar.constants;

public enum DbProperties {
	
	URL("jdbc:mysql://localhost:3306/bar"),USERNAME("root"),SECRETE("Ajay@1234");
	
	
	private String value;
	
	private DbProperties(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
	
	
	

}
