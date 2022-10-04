package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Itemmastercostotherheads{

	@NonNull
	private String mainCategory;
	@NonNull
	private String subCategory;
	@NonNull
	private String itemCode;
	@NonNull
	private String accHeadCode;
	private Double jobCost;
}
