package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Enquiryformitem{

	@NonNull
	private Integer enquiryId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private String processFrom;
	private String processTo;
	private Double eQYQty;
	private Double unitPrice;
	private Double discount;
	private Double vATPercent;
	private Double cSTPercent;
	private Double excisePercent;
	private Double serviceTaxPercent;
	private Double packageForward;
	private Double advance;
	private String warranty;
	private Integer leadTime;
	private Double insurance;
	private String supplierUOM;
	private Double convFactor;
	private Double cashDiscPercent;
}
