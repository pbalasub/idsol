package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stdeliverychallanitem{

	@NonNull
	private Integer dCId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private Double dCQty;
	private Double alternateQty;
	private String referenceNo;
	private String custOrderNo;
	private String workOrderNo;
	private String purpose;
	private String itemRemarks;
	private String issue;
	private String receipt;
	private Double dcAccQty;
	private Double dcRejQty;
	private String inwardno;
	private Date lastInwardDate;
	private Double dpResult;
	private Date deliveryDate;
}
