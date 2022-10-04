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
public class Employeesalarymaster{

	@NonNull
	private String esmNo;
	private Date esmDate;
	private String empCode;
	private Double basic;
	private Double hra;
	private Double conveyance;
	private Double washing;
	private Double allowance1;
	private Double allowance2;
	private Double allowance3;
	private Double allowance4;
	private Double allowance5;
	private Double allowance6;
	private Date salaryEffectiveFrom;
	private Date salaryEffectiveTo;
	private String salaryStatus;
	private String closureStatus;
	private String closureRemarks;
	private String closureName;
	private Date closureDate;
	private LocalTime closureTime;
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
