package com.xworkz.cat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cat")
public class CatEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="breed")
	private String breed;
	@Column(name="age")
	private int age;
	@Column(name="birthYear")
	private int birthYear;
	@Column(name="clothType")
	private  String clothType;

}
