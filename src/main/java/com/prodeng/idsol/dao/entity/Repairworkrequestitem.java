package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Repairworkrequestitem{

	@NonNull
	private Integer rWRId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private String processFrom;
	private String processTo;
	private Double rWRQty;
	private Integer reqLatestDays;
	private Date reqLatestDate;
	private String purpose;
	private String historyCode;
	private String rejReason;
	private String supplierCode;
}
