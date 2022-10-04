package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stmrnoteitem{

	@NonNull
	private Integer mRNId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private String process;
	private String referenceNo;
	private Double mRNQty;
	private Double alternateQty;
	private Double recQty;
	private String reason;
	private String result;
	private String itemRemarks;
	private String historyCode;
	private String rINo;
	private Double rejQty;
	private String rejReason;
	private Double concAccQty;
	private String concAccReason;
}
