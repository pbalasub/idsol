package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expenditurebudgetplandetails{

	@NonNull
	private Integer eBPId;
	@NonNull
	private String accHeadCode;
	private String remarks;
	private Double aprAmount;
	private Double mayAmount;
	private Double junAmount;
	private Double julAmount;
	private Double augAmount;
	private Double sepAmount;
	private Double octAmount;
	private Double novAmount;
	private Double decAmount;
	private Double janAmount;
	private Double febAmount;
	private Double marAmount;
}
