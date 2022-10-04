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
public class Suggestiondetailsrecord{

	@NonNull
	private String suggestionNo;
	private Date creationDate;
	private String type;
	private String providerEmpCode;
	private String providerName;
	private String providerDept;
	private Date dateOfSuggestion;
	private String coreSuggestion;
	private String remarks;
	private String suggestionAccepted;
	private String mementoGiven;
	private String teamRemarks;
	private String awardDetail;
	private Double prizeAmount;
	private Date dateOfImplementation;
	private String implementationRemarks;
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
}
