package com.xworkz.pub;

public class PubDTO {
	
	
	
	private int id;
     private String name;
     private String location;
     private String type;
     private String collectionPerDay;
     
     public PubDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCollectionPerDay() {
		return collectionPerDay;
	}

	public void setCollectionPerDay(String collectionPerDay) {
		this.collectionPerDay = collectionPerDay;
	}
     
     
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
     
	
	
}
