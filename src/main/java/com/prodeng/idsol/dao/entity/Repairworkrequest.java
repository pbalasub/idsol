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
public class Repairworkrequest{

	@NonNull
	private Integer rWRId;
	private String rWRNo;
	private Date rWRDate;
	private String orderType;
	private String dept;
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
	private String closureStatus;
	private String closureRemarks;
	private String closureName;
	private Date closureDate;
	private LocalTime closureTime;
}
