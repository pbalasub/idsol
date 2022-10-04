package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Purchaserequestitem{

	@NonNull
	private Integer pRId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private Double pRQty;
	private Integer reqLatestDays;
	private Date reqLatestDate;
	private String purpose;
	private String rejReason;
	private String supplierCode;
	private String colour;
	private String process;
	private String uOM;
}
