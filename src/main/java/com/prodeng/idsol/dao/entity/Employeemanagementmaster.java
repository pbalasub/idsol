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
public class Employeemanagementmaster{

	@NonNull
	private String empCode;
	private Date dateOfJoining;
	private Date dateOfConfirmation;
	private Date dateOfLeaving;
	private String status;
	private String designation;
	private String grade;
	private String dept;
	private String awardDetails;
	private String previousExperience;
	private String currentExperience;
	private String pANNo;
	private String accountNo;
	private String bankName;
	private String branchName;
	private String ePFNo;
	private String eSINo;
	private String eSIDispensary;
	private String remarks;
	private String physicalStatus;
	private String referredBy;
	private Date effectiveFrom;
	private Date effectiveTill;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
