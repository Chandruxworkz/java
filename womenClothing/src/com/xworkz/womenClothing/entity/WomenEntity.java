package com.xworkz.womenClothing.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name="womeninfo")
public class WomenEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="shopName")
	private String shopName;
	@Column(name="createDate")
	private LocalDate createDate;
	@Column(name="createdBy")
	private String createdBy;
	@Column(name="owner")
	private String owner;
	@Column(name="pricePerDay")
	private double pricePerDay;
	
	
	
	
	
	
	

} 
