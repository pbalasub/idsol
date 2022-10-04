package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Revenuebudgetplandetails{

	@NonNull
	private Integer rBPId;
	@NonNull
	private Integer serialNo;
	private String mainCategory;
	private String subCategory;
	private String itemCode;
	private Double labourCharge;
	private Double rMCost;
	private String customerCode;
	private String remarks;
	private Integer aprQty;
	private Integer mayQty;
	private Integer junQty;
	private Integer julQty;
	private Integer augQty;
	private Integer sepQty;
	private Integer octQty;
	private Integer novQty;
	private Integer decQty;
	private Integer janQty;
	private Integer febQty;
	private Integer marQty;
}
