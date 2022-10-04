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
public class Stinwardrequest{

	@NonNull
	private Integer inwardId;
	private String inwardno;
	private Date inwardDate;
	private String dept;
	private String orderNo;
	private String orderType;
	private String ourDcNo;
	private String ourDCType;
	private String supplierCode;
	private String supplierDCNo;
	private Date supplierDCDate;
	private String supplierBillNo;
	private Date supplierBillDate;
	private String supplierExciseGatePassNo;
	private Date supplierExciseGatePassDate;
	private String weighAt;
	private String transporterName;
	private String lRNo;
	private String weighBridgeName;
	private String weighBillNo;
	private String remarks;
	private String inspectionReport;
	private String receivedThrough;
	private String receivedThrough1;
	private String driverName;
	private String status;
	private String stage;
	private String rejectReason;
	private String comments;
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
	private String closureStatus;
	private String closureRemarks;
	private String closureName;
	private Date closureDate;
	private LocalTime closureTime;
}
