package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employeequalification{

	@NonNull
	private String empCode;
	@NonNull
	private Integer serialNo;
	private String qualification;
	private String institution;
	private String yearPassed;
	private String gradePercentage;
}
