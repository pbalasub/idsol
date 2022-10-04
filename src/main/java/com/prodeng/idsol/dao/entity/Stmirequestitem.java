package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stmirequestitem{

	@NonNull
	private Integer mIRId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private Double mIRQty;
	private Double alternateQty;
	private String process;
	private String purpose;
	private String historyCode;
	private Double issQty;
	private String tagNo;
	private String referenceNo;
}
