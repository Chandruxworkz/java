package com.xworkz.politician.costant;

public enum MysqlProperties {
		
		URL("jdbc:mysql://localhost:3306/politician"),USERNAME("root"),SECRET("Ajay@1234");	
		
		private String value;
		
		private MysqlProperties(String value) {
			this.value=value;
		}
		
		public String getValue() {
			return value;
		}


	}



