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
public class Employeeperformanceappraisal{

	@NonNull
	private String ePANo;
	private Date ePADate;
	private String appraisalType;
	private String empCode;
	private String appraiserCode;
	private Date periodFrom;
	private Date periodTill;
	private Integer overAllRatingValue;
	private String overAllGrade;
	private String suggestion;
	private String awardDetail;
	private String continousImprovement;
	private String result;
	private String extendedPeriod;
	private String resultReason;
	private Date effectiveDate;
	private String toBeDesignated;
	private Double proposedSalary;
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
}
