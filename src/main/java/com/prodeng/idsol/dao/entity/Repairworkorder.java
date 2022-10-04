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
public class Repairworkorder{

	@NonNull
	private Integer rWOId;
	private String rWONo;
	private String rWRNo;
	private Date rWODate;
	private String orderType;
	private String dept;
	private String supplierCode;
	private Double packageForward;
	private Double freight;
	private Double insurance;
	private Double others;
	private Double basicED;
	private Double vAT;
	private String guarantee;
	private String paymentTerms;
	private String deliveryAt;
	private Double totalRWO;
	private Double advance;
	private Double toBePaid;
	private Double serviceTax;
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
	private Double disbursedAmt;
	private String closureStatus;
	private String closureRemarks;
	private String closureName;
	private Date closureDate;
	private LocalTime closureTime;
}
