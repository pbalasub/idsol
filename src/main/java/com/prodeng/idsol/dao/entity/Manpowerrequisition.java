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
public class Manpowerrequisition{

	@NonNull
	private String mPRNo;
	private Date mPRDate;
	private String designation;
	private Integer noOfRequirement;
	private Double proposedSalary;
	private String grade;
	private String dept;
	private String positionReportTo;
	private String jobDescription;
	private String qualification;
	private String experience;
	private String budgetted;
	private String gender;
	private String minimumAge;
	private String maximumAge;
	private String replacementFor;
	private String reason;
	private String additionalInformation;
	private Date requiredLatestBy;
	private String positionFillBy;
	private String eligibleEmployee1;
	private String eligibleEmployee2;
	private String approvalStatus;
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
