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
public class Stmrnote{

	@NonNull
	private Integer mRNId;
	private String mRNNo;
	private Date mRNDate;
	private String dept;
	private String remarks;
	private String sectionCode;
	private String empCode;
	private String empName;
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
	private String closureStatus;
	private String closureRemarks;
	private String closureName;
	private Date closureDate;
	private LocalTime closureTime;
}
