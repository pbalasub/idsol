package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mtcecharplandetails{

	@NonNull
	private Integer cPId;
	@NonNull
	private Integer serialNo;
	private String characteristics;
	private String planType;
	private String specialChar;
	private String evalTech;
	private String daily;
	private String weekly;
	private String monthly;
	private String quarterly;
	private String halfYearly;
	private String annually;
}
