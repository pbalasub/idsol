package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Processmasteritem{

	@NonNull
	private String mainCategory;
	@NonNull
	private String subCategory;
	@NonNull
	private String itemCode;
	@NonNull
	private Integer serialNo;
	private String processCode;
	private Integer orderSeq;
	private String visible;
}
