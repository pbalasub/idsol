package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employeetrainingeffectiveness{

	@NonNull
	private Integer eTRId;
	@NonNull
	private Integer serialNo;
	private String criteria;
	private String evalRemarks;
	private String rating;
}
