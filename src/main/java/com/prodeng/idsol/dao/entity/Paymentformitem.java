package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paymentformitem{

	@NonNull
	private Integer paymentId;
	@NonNull
	private Integer serialNo;
	private String orderType;
	private String orderNo;
	private Double orderAmount;
	private Double orderAdvance;
	private Double orderToBePaid;
	private String supplierBillNo;
	private Date supplierBillDate;
	private Double supplierBillAmt;
	private Double packageForward;
	private Double exciseDuty;
	private Double educationCess;
	private Double secHighEduCess;
	private Double vAT;
	private Double serviceTax;
	private Double insurance;
	private Double freight;
	private Double diffAmt;
	private String diffAmtReason;
	private Double recommendedAmt;
	private String accHeadCode;
}
