package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paymentformiteminward{

	@NonNull
	private Integer paymentId;
	@NonNull
	private Integer serialNo;
	@NonNull
	private Integer inwardId;
	@NonNull
	private Integer inwardSerialNo;
	private String inwardNo;
	private String itemCode;
}
