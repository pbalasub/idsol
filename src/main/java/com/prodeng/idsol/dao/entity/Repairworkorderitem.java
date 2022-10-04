package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Repairworkorderitem{

	@NonNull
	private Integer rWOId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private String processFrom;
	private String processTo;
	private String historyCode;
	private Double rWOQty;
	private Integer reqLatestDays;
	private Date reqLatestDate;
	private Double itemRate;
	private Double discount;
	private Double cashDisc;
	private Double totalRate;
	private Date fromDate;
	private Date toDate;
	private Double unitPrice;
}
