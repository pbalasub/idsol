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
public class Paymentformrequest{

	@NonNull
	private Integer paymentId;
	private String paymentNo;
	private String paymentFor;
	private String dept;
	private String supplierCode;
	private String inFavourOf;
	private Date reqLatestDate;
	private String remarks;
	private String chequeNo;
	private Date chequeDate;
	private Double chequeAmount;
	private String chequeAmtInWrds;
	private String bankName;
	private Double paymentTotalAmount;
	private String paymentTotalAmtInWrds;
	private String rejectReason;
	private String comments;
	private String status;
	private String stage;
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
	private String stageSixName;
	private Date stageSixDate;
	private LocalTime stageSixTime;
	private Date paymentReqDate;
	private String branchName;
	private String bankAccountNo;
}
