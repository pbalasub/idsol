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
public class Leaveondutyform{

	@NonNull
	private String lofNo;
	private Date lofDate;
	private String empCode;
	private String empName;
	private Date elFromDate;
	private Date elToDate;
	private Date clFromDate;
	private Date clToDate;
	private Date mlFromDate;
	private Date mlToDate;
	private Date esilFromDate;
	private Date esilToDate;
	private Date olFromDate;
	private Date olToDate;
	private Double elDays;
	private Double clDays;
	private Double mlDays;
	private Double esilDays;
	private Double olDays;
	private String ltReason;
	private String ltRemarks;
	private Date odFromDate;
	private Date odToDate;
	private Double odDays;
	private String odReason;
	private String odRemarks;
	private Date coFromDate;
	private Date coToDate;
	private Double coDays;
	private String coReason;
	private String coRemarks;
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
}
