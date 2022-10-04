package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employeerelation{

	@NonNull
	private String empCode;
	@NonNull
	private Integer serialNo;
	private String relationship;
	private String relationName;
	private Date dateOfBirth;
	private String stayTogether;
	private String dependent;
	private String nominee;
	private String qualification;
	private String natureOfWork;
}
