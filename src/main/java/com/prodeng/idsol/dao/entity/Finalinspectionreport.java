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
public class Finalinspectionreport{

	@NonNull
	private Integer fIRId;
	@NonNull
	private String fIRNo;
	private Date fIRDate;
	private String controlPlanNo;
	private String customerCode;
	private String itemCode;
	private String drawingName;
	private String revisionNo;
	private String custItemCode;
	private String dCNo;
	private Integer fIRQty;
	private Integer sampleQty;
	private String inspectedBy1;
	private String inspectedBy2;
	private String inspectedBy3;
	private String inspectedBy4;
	private String remarks;
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
	private String fIRCondition;
	private String specification;
	private String supplierCode;
}
