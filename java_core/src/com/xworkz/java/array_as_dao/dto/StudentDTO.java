package com.xworkz.java.array_as_dao.dto;

public class StudentDTO {
	private String id;
	private String name;
	private String batchName;
	private long phNo;
	private String percentage;
	
	public StudentDTO(String id, String name, String batchName, long phNo, String percentage) {
		this.id = id;
		this.name = name;
		this.batchName = batchName;
		this.phNo = phNo;
		this.percentage = percentage;
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	
}
