package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Budgetmaster{

	@NonNull
	private String sectionCode;
	private String sectionName;
	@NonNull
	private Integer month;
	@NonNull
	private Integer year;
	private Double phase1;
	private Double phase2;
	private Double phase3;
	private Double phase4;
	private Double alttotal;
	private Double po;
	private Double jwo;
	private Double rwo;
	private Double swo;
	private Double others;
	private Double contotal;
	private String updatedHistory;
	private String nameOfLastUpdate;
	private Date dateOfLastUpdate;
}
