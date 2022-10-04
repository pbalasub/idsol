package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calibrationhistorycarddetails{

	@NonNull
	private Integer cHCId;
	@NonNull
	private Integer serialNo;
	private String calibCondition;
	private Date dateOfCalibration;
	private String calibratedBy;
	private String certificateRef;
	private String errorDetails;
	private String accCriteriaLimit;
	private String actionTaken;
	private Date dueDate;
	private String remarks;
	private String approvedBy;
	private String activeFlag;
}
