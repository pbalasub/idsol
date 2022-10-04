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
public class Continualimprovement{

	@NonNull
	private String cINo;
	private Date cIDate;
	private String projectTitle;
	private String projectDesc;
	private Date targetDate;
	private String remarks;
	private String responsibleTeam;
	private String actionRemarks;
	private Date startDate;
	private Date endDate;
	private String improvementStatus;
	private String metricsDetails;
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
}
