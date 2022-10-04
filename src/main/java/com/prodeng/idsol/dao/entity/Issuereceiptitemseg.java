package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Issuereceiptitemseg{

	@NonNull
	private Integer iRId;
	@NonNull
	private Integer serialNo;
	@NonNull
	private String segType;
	@NonNull
	private String characteristics;
	private Double qtyInNos;
	private String reason;
	private String identity;
}
