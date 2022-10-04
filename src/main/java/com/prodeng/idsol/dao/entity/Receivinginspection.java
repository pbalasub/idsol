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
public class Receivinginspection{

	@NonNull
	private Integer rIId;
	@NonNull
	private String rINo;
	private Date rIDate;
	private String inwardNo;
	private String itemCode;
	private String inspectionReport;
	private String receipt;
	private String colourCode;
	private Double receivedQty;
	private Double sampleQty;
	private String testCertificateNo;
	private String testedAt;
	private String reportDetail;
	private String result;
	private String resultReason;
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
	private String batchNoInd;
	private String batchNo;
	private String cPNo;
	private String mRNNo;
	private String cPFor;
	private String supplierCode;
	private String supplierDCNo;
	private String workOrderNo;
}
