package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mtceinspectionreportdetails{

	@NonNull
	private Integer iRId;
	@NonNull
	private Integer serialNo;
	private String characteristics;
	private String specialChar;
	private String evalTech;
	private String workDoneDetails;
	private String sparesReplaced;
	private String observation;
}
