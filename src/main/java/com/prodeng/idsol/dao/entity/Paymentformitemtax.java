package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paymentformitemtax{

	@NonNull
	private Integer paymentId;
	@NonNull
	private Integer serialNo;
	@NonNull
	private String taxCode;
	private Double taxValue;
}
