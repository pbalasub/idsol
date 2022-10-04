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
public class Mtceinspectionreport{

	@NonNull
	private Integer iRId;
	@NonNull
	private String iRNo;
	private Date iRDate;
	private String mPNo;
	private String historyCode;
	private String planType;
	private String frequency;
	private Date plannedOn;
	private Date actionTakenOn;
	private String cPNo;
	private String cPUpdatedBy;
	private Date cPUpdatedDate;
	private LocalTime cPUpdatedTime;
	private String inspectedBy1;
	private String inspectedBy2;
	private String recommendation;
	private String reviewedBy;
	private String reviewedComments;
	private String status;
	private String stage;
	private String stageOneName;
	private Date stageOneDate;
	private LocalTime stageOneTime;
	private String stageTwoName;
	private Date stageTwoDate;
	private LocalTime stageTwoTime;
}
