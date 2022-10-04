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
public class Nccar{

	@NonNull
	private String nCCARNo;
	private Date nCCARDate;
	private String nCCARType;
	private String refNo;
	private String suppSecCode;
	private String itemCode;
	private String problemStatus;
	private String deviationObserved;
	private String rootCause;
	private String correctiveAction;
	private String preventiveAction;
	private Date targetDate;
	private Date verifiedDate;
	private String verifiedDetails;
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
	private String supplierDCNo;
	private String result;
	private String reportDetail;
}
