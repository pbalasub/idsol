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
public class Historymaster{

	@NonNull
	private String historyCode;
	@NonNull
	private String itemCode;
	private String type;
	private String orderNo;
	private String supplierName;
	private Integer manufactureYear;
	private String make;
	private String model;
	private String capacity;
	private String serialNo;
	private String remarks;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
	private String orderType;
	private Integer toolLifePlanned;
	private Integer toolLifeAchieved;
	private String status;
	private Date validFrom;
	private Date validTill;
	private String specialRemarks;
	private String sectionCode;
}
