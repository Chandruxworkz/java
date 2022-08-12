package com.xworkz.bar.DTO;

import java.io.Serializable;

import com.xworkz.bar.constants.BarType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
public class BarDTO implements Serializable{
	
	@Getter
	@Setter
	
	private Integer id;
	private String barName;
	private String location;
	private BarType type = BarType.DEFAULT;
	private Double avrCollectionPerDay;
	private Double avrCollectionPerMonth;
	
	
	
	public String getBarName() {
		return barName;
	}
	public void setBarName(String barName) {
		this.barName = barName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public BarType getType() {
		return type;
	}
	public void setType(BarType type) {
		this.type = type;
	}
	public Double getAvrCollectionPerDay() {
		return avrCollectionPerDay;
	}
	public void setAvrCollectionPerDay(Double avrCollectionPerDay) {
		this.avrCollectionPerDay = avrCollectionPerDay;
	}
	public Double getAvrCollectionPerMonth() {
		return avrCollectionPerMonth;
	}
	public void setAvrCollectionPerMonth(Double avrCollectionPerMonth) {
		this.avrCollectionPerMonth = avrCollectionPerMonth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
