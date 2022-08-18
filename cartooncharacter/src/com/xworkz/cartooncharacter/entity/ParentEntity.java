package com.xworkz.cartooncharacter.entity;
import java.time.LocalDate;

import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
@AllArgsConstructor


public class ParentEntity {
	
	private String createdby;
	private LocalDate createddate;
	private String updatedby;
	private LocalDate updateddate;
}
	


