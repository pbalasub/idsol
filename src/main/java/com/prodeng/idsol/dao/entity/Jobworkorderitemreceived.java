package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Jobworkorderitemreceived{

	@NonNull
	private Integer jWOId;
	@NonNull
	private Integer serialNo;
	@NonNull
	private String itemCodeReceived;
	private Double jWOQtyReceived;
	private Double itemRate;
	private Double discount;
	private Double cashDisc;
	private Double totalRate;
	private String alternateUOM;
	private Double convFactor;
	private Double unitPrice;
	private Double packageForward;
	private Double insurance;
	private Double exciseDuty;
	private Double vAT;
	private Double serviceTax;
}
