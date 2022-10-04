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
public class Employeeattnmaster{

	private Integer empId;
	@NonNull
	private String empCode;
	@NonNull
	private Date attnDate;
	private Date currentDate;
	private String timeIn;
	private String timeOut;
	private Double workHour;
	private Double workMinutes;
	private Double otHour;
	private Double otMinutes;
	private Integer workDay;
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
