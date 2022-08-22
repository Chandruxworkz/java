package com.xworkz.market.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
@AllArgsConstructor
@ToString

public class ParentEntity {
	private String createdby;
	private LocalDateTime createddate;
	private String updatedby;
	private LocalDateTime updateddate;
}
