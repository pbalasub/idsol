package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cashvoucherdetails{

	@NonNull
	private Integer cVId;
	@NonNull
	private Integer serialNo;
	private String headCode;
	private String particulars;
	private String tranType;
	private Double tranAmount;
}
