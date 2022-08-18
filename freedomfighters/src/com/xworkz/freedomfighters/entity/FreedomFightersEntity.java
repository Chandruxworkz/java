package com.xworkz.freedomfighters.entity;

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
@ToString
@Entity
@Table(name="freedomfighter_info")

public class FreedomFightersEntity extends ParentEntity {
	@GenericGenerator(name = "some",strategy = "increment")
	@Id
	@GeneratedValue(generator = "some")
	private Integer fid;
	private String name;
	private String location;
	private LocalDate dateofbirth;
	private LocalDate deathdate;

	public FreedomFightersEntity(String name, String location, LocalDate dateofbirth, LocalDate deathdate,
			String createdby, LocalDate createddate, String updatedby, LocalDate updateddate) {
		super(createdby, createddate, updatedby, updateddate);
		this.name = name;
		this.location = location;
		this.dateofbirth=dateofbirth;
		this.deathdate=deathdate;
		
	}

}
