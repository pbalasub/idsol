package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Jobworkrequestitemreceived{

	@NonNull
	private Integer jWRId;
	@NonNull
	private Integer serialNo;
	@NonNull
	private String itemCodeReceived;
	private Double jWRQtyReceived;
	private String supplierCode;
}
