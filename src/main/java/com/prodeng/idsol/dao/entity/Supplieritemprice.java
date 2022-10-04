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
public class Supplieritemprice{

	@NonNull
	private String supplierCode;
	@NonNull
	private String itemCode;
	@NonNull
	private String processFrom;
	@NonNull
	private String processTo;
	private Integer leadTime;
	private Double unitPrice;
	private Double discPercent;
	private Double advance;
	private Double cashDiscPercent;
	private Double vatPercent;
	private Double excisePercent;
	private Double packageForward;
	private Double cSTPercent;
	private Double serviceTaxPercent;
	private Double insurancePercent;
	private String uOM;
	private String alternateUOM;
	private Double convFactor;
	private Date rateValidFrom;
	private Date rateValidTo;
	private String ourRef;
	private String yourRef;
	private String warranty;
	private String issuedDrawing;
	private Date issuedDate;
	private String receivedDrawing;
	private Date receivedDate;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
