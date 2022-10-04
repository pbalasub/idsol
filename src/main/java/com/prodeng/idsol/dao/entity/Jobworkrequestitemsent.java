package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Jobworkrequestitemsent{

	@NonNull
	private Integer jWRId;
	@NonNull
	private Integer serialNo;
	@NonNull
	private String itemCodeSent;
	private Double jWRQtySent;
}
