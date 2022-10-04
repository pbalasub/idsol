package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Enquiryformrequest{

	@NonNull
	private Integer enquiryId;
	private String enquiryNo;
	private String enquiryType;
	private String dept;
	private String supplierCode;
	private Date reqLatestDate;
	private String remarks;
	private String quoteNo;
	private String fieldPersonRemarks;
	private String supplierRemarks;
	private String approverRemarks;
	private String purchaserName1;
	private String purchaserName2;
	private String refNo;
	private Date quoteValidFrom;
	private Date quoteValidTill;
	private String status;
	private String stage;
	private String rejectReason;
	private String stageOneName;
	private Date stageOneDate;
	private LocalTime stageOneTime;
	private String stageTwoName;
	private Date stageTwoDate;
	private LocalTime stageTwoTime;
	private String stageThreeName;
	private Date stageThreeDate;
	private LocalTime stageThreeTime;
	private String stageFourName;
	private Date stageFourDate;
	private LocalTime stageFourTime;
	private String stageFiveName;
	private Date stageFiveDate;
	private LocalTime stageFiveTime;
}
