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
public class Employeesalaryreport{

	@NonNull
	private String esrNo;
	private Date esrDate;
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
	private Double daysToBeWorked;
	private Double noOfSundays;
	private Double noOfHolidays;
	private Double daysWorked;
	private Double otHours;
	private Double eleaveDays;
	private Double cleaveDays;
	private Double ondutyDays;
	private Double coDays;
	private Double payBasic;
	private Double payHra;
	private Double payConveyance;
	private Double payWashing;
	private Double payAllowance1;
	private Double payAllowance2;
	private Double payAllowance3;
	private Double payAllowance4;
	private Double payAllowance5;
	private Double payAllowance6;
	private Double pfAmount;
	private Double esiAmount;
	private Double profTax;
	private Double deduction1;
	private Double deduction2;
	private Double deduction3;
	private Double deduction4;
	private Double deduction5;
	private Double deduction6;
	private Double grossSalary;
	private Double grossDeduction;
	private Double netSalary;
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
