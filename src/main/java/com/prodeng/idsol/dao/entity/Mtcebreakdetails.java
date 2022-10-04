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
public class Mtcebreakdetails{

	@NonNull
	private Integer bSId;
	@NonNull
	private String bSNo;
	@NonNull
	private String historyCode;
	private Date bSDate;
	private String natureOfBreak;
	private Integer fromBreakTimeHour;
	private Integer fromBreakTimeMinute;
	private Integer toBreakTimeHour;
	private Integer toBreakTimeMinute;
	private Integer totalBreakTimeHour;
	private Integer totalBreakTimeMinute;
	private Date breakStartDate;
	private Date breakEndDate;
	private String remarks1;
	private String supervisorName;
	private String subOrdinateName;
	private String remarks2;
	private String problemMachineCode;
	private String reason;
	private String workDoneDetails;
	private String sparesReplaced;
	private String preventiveAction;
	private String status;
	private String stage;
	private String rejectReason;
	private String comments;
	private String stageOneName;
	private Date stageOneDate;
	private LocalTime stageOneTime;
	private String stageTwoName;
	private Date stageTwoDate;
	private LocalTime stageTwoTime;
	private String stageThreeName;
	private Date stageThreeDate;
	private LocalTime stageThreeTime;
}
