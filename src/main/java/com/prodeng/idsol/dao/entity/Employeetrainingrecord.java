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
public class Employeetrainingrecord{

	@NonNull
	private Integer eTRId;
	@NonNull
	private String eTRNo;
	private Date eTRDate;
	private String eTPNo;
	private String trainingName;
	private String empCode;
	private String documentNo;
	private String revisionNo;
	private String underIssueNo;
	private String specialOperation;
	private String placeOfTraining;
	private String areaOfTraining;
	private String facultyName;
	private Date periodFrom;
	private Date periodTill;
	private String remarks;
	private String empEvalNeeded;
	private String empEvalPeriod;
	private String empEvalMethod;
	private String empEvalResult;
	private String reviewRequired;
	private String reviewPeriod;
	private Date dateOfEvaluation;
	private String empEvalRemarks;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
