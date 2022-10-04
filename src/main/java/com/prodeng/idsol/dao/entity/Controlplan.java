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
public class Controlplan{

	@NonNull
	private Integer cPId;
	@NonNull
	private String cPNo;
	private Date cPDate;
	private String cPFor;
	private String process;
	private String itemCode;
	private String drawingName;
	private String revisionNo;
	private Date revisionDate;
	private String cPStatus;
	private String custEngAppr;
	private Date custEngApprDate;
	private String custQualAppr;
	private Date custQualApprDate;
	private String custOtherAppr;
	private Date custOtherApprDate;
	private String plantAppr;
	private Date plantApprDate;
	private String suppAppr;
	private Date suppApprDate;
	private String suppOtherAppr;
	private Date suppOtherApprDate;
	private String keyContact;
	private String coreTeam;
	private String latestLevelIssue;
	private Date latestLevelIssueDate;
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
	private String customercode;
}
