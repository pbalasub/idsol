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
public class Issuereceipt{

	@NonNull
	private Integer iRId;
	@NonNull
	private String iRNo;
	private Date iRDate;
	private String iRType;
	private String wONo;
	private String wOSection;
	private String iRSection;
	private String empCode;
	private String issueNo;
	private String processFrom;
	private String processTo;
	private String remarks;
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
	private Double prodHours;
}
