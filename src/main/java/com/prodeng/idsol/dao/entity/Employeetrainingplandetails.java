package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employeetrainingplandetails{

	@NonNull
	private Integer eTPId;
	@NonNull
	private Integer serialNo;
	private String trainingName;
	private String remarks;
	private Date trainingDate;
	private Double noOfDays;
	private Integer noOfPerson;
}
