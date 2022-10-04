package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Purchaseorderitem{

	@NonNull
	private Integer pOId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private Double pOQty;
	private Integer reqLatestDays;
	private Date reqLatestDate;
	private Double itemRate;
	private Double cashDisc;
	private Double totalRate;
	private String colour;
	private String process;
	private String alternateUOM;
	private Double convFactor;
	private Double unitPrice;
	private Double discount;
	private Double packageForward;
	private Double exciseDuty;
	private Double vAT;
	private Double serviceTax;
	private Double insurance;
	private Double pOAccQty;
	private Double poRejQty;
	private String inwardno;
	private Date lastInwardDate;
	private Double dpResult;
	private Double freight;
}
