package com.xworkz.market.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "market_details")

public class MarketEntity extends ParentEntity {
	@GenericGenerator(name = "Ajay", strategy = "increment")
	@GeneratedValue(generator = "Ajay")
	@Id

	private Integer mid;
	private String MarketName;
	private String location;
	private Integer noOfStall;
	private Integer maxCapacity;
	
	public MarketEntity(String MarketName, String location, Integer noOfStall, Integer maxCapacity,
			String createdby, LocalDate createddate, String updatedby, LocalDate updateddate) {
		super();
		this.MarketName = MarketName;
		this.location = location;
		this.noOfStall = noOfStall;
		this.maxCapacity = maxCapacity;
	
}
}