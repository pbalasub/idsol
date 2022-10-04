package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Itemmastercostprocess{

	@NonNull
	private String mainCategory;
	@NonNull
	private String subCategory;
	@NonNull
	private String itemCode;
	@NonNull
	private String suppCode;
	@NonNull
	private String processFrom;
	@NonNull
	private String processTo;
	private Double processWeight;
	private Double yieldProcessWeight;
	private Double jobCost;
	private String location;
	private String identity;
	private String rMItemCode;
}
