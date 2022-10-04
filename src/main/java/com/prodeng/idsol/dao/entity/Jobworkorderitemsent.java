package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Jobworkorderitemsent{

	@NonNull
	private Integer jWOId;
	@NonNull
	private Integer serialNo;
	@NonNull
	private String itemCodeSent;
	private Double jWOQtySent;
	private String uOM;
}
