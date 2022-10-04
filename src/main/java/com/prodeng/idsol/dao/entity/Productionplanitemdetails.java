package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Productionplanitemdetails{

	@NonNull
	private Integer pPId;
	@NonNull
	private String itemCode;
	@NonNull
	private Integer serialNo;
	private Double qtyInNos;
	private Date targetDate;
}
