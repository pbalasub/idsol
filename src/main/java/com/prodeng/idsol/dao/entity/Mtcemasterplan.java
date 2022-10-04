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
public class Mtcemasterplan{

	@NonNull
	private Integer mPId;
	@NonNull
	private String mPNo;
	private Date mPDate;
	private String planType;
	private Date planFromDate;
	private Date planTillDate;
	private String status;
	private String stage;
	private String stageOneName;
	private Date stageOneDate;
	private LocalTime stageOneTime;
	private String stageTwoName;
	private Date stageTwoDate;
	private LocalTime stageTwoTime;
}
