package com.xworkz.cartooncharacter.entity;


import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
@ToString
@Entity

@Table(name= "cartooncharacter_info")
@NamedQueries({
		//@NamedQuery(name = "findByName", query = "select cartoon from CartoonCharacterEntity cartoon where cartoon.name=:name"),
		//@NamedQuery(name = "findByNameAndCountryAndGenderAndAuthor", query ="select cartoon from CartoonCharacterEntity cartoon where cartoon.name=:nm"),
		@NamedQuery(name = "findAuthorByName", query ="select cartoon.author from CartoonCharacterEntity cartoon where cartoon.name=:an")
})

public class CartoonCharacterEntity extends ParentEntity {
	@GenericGenerator(name = "Ajay", strategy = "increment")
	@GeneratedValue(generator = "Ajay")
	@Id

	private Integer cid;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;

	public CartoonCharacterEntity(String name, String country, String gender, String author, String type,
			String createdby, LocalDate createddate, String updatedby, LocalDate updateddate) {
		super(createdby, createddate, updatedby, updateddate);
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}

}
