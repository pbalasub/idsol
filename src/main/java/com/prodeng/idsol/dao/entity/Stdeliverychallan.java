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
public class Stdeliverychallan{

	@NonNull
	private Integer dCId;
	private String dCNo;
	private String dCType;
	private Date dCDate;
	private String orderType;
	private String orderNo;
	private String customerCode;
	private String yourDCRef;
	private String delyAt;
	private String transCode;
	private String transName;
	private String weighBridge;
	private String weighBillNo;
	private String vehicleNo;
	private String driverName;
	private String remarks;
	private String delyPerson1;
	private String delyPerson2;
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
	private String stageFourName;
	private Date stageFourDate;
	private LocalTime stageFourTime;
	private String stageFiveName;
	private Date stageFiveDate;
	private LocalTime stageFiveTime;
	private String closureStatus;
	private String closureRemarks;
	private String closureName;
	private Date closureDate;
	private LocalTime closureTime;
	private Double valueOfGoodsRs;
	private String valueOfGoodsWords;
	private Date deliveryDate;
	private String delyCode;
	private String procType;
}
