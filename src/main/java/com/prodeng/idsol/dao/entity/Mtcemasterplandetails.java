package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mtcemasterplandetails{

	@NonNull
	private Integer mPId;
	@NonNull
	private Integer serialNo;
	private String historyCode;
	private String daily;
	private String weekly;
	private Date monthlyStartDate;
	private Integer monthlyDaysReqd;
	private Date quarterlyStartDate;
	private Integer quarterlyDaysReqd;
	private Date halfYearlyStartDate;
	private Integer halfYearlyDaysReqd;
	private Date annuallyStartDate;
	private Integer annuallyDaysReqd;
}
