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
public class Productionentrymaster{

	@NonNull
	private String prodNo;
	private String workOrderNo;
	private String itemCode;
	private String processFrom;
	private String processTo;
	private Double prodHrs;
	private Double accQty;
	private Double rejQty;
	private Double ncQty;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
	private String flag;
}
