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
public class Employeeaccidentreport{

	@NonNull
	private String eARNo;
	private Date eARDate;
	private String empCode;
	private String shift;
	private String workStartHour;
	private Date dateOfAccident;
	private String timeOfAccident;
	private String natureOfAccident;
	private String extentOfInjury;
	private String locationOfInjury;
	private String contraventionOfRules;
	private String historyCode;
	private String machineName;
	private String machinePartName;
	private String remarks;
	private String witnessEmpCode1;
	private String witnessEmpCode2;
	private String supervisorEmpCode;
	private String hODEmpCode;
	private String analysisMember1;
	private String analysisMember2;
	private String rootCause;
	private String coreMatter;
	private String teamSuggestion;
	private String additionalRemarks;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
