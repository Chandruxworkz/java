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
@ToString(callSuper = true)
@Entity
@Table(name = "cartooncharacter_info")
@NamedQueries({
		@NamedQuery(name = "findByName", query = "select cartoon from CartoonCharacterEntity cartoon where cartoon.name=:name"),
		@NamedQuery(name = "findByNameAndCountryAndGenderAndAuthor", query = "select cartoon from CartoonCharacterEntity cartoon where cartoon.name=:nm"),
		@NamedQuery(name = "findAuthorByName", query = "select cartoon.author from CartoonCharacterEntity cartoon where cartoon.name=:an"),
		@NamedQuery(name = "findNameAndCountryByAuthor", query = "select cartoon.name, cartoon.country from CartoonCharacterEntity cartoon where cartoon.author=:at"),
		@NamedQuery(name = "findCreatedDateByAuthor", query = "select cartoon.createddate from CartoonCharacterEntity cartoon where cartoon.author= :au"),

		@NamedQuery(name = "updateAuthor", query = "update CartoonCharacterEntity c set c.author=:at where c.name=:nm"),
		@NamedQuery(name = "findAllByAuthor", query = "select cc from  CartoonCharacterEntity cc where cc.author=:au"),
		@NamedQuery(name = "findAllByAuthorAndGender", query = "select cc from  CartoonCharacterEntity cc where cc.author=:au and cc.gender=:ge"),
		@NamedQuery(name = "findAllCountry", query = "select cc.country from CartoonCharacterEntity cc"),
		@NamedQuery(name = "findAllNameAndCountry", query = "select cc.name,cc.country  from CartoonCharacterEntity cc"),
		@NamedQuery(name = "findAllName", query = "select cc.name from CartoonCharacterEntity cc"),
		@NamedQuery(name = "findAll", query = "select cc from CartoonCharacterEntity cc"),
		//@NamedQuery(name = "findAllNameAndCountryAndAuthor", query = "select cc.name,cc.country,cc.author  from CartoonCharacterEntity cc"),
		@NamedQuery(name = "updateTypeByName", query = "update CartoonCharacterEntity cartoon set cartoon.type =:type where cartoon.name = :name"),
		@NamedQuery(name = "deleteByName", query = "delete from CartoonCharacterEntity cartoon where cartoon.name = :dname"),

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
