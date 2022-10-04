package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stinwarditem{

	@NonNull
	private Integer inwardId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private Double dCQty;
	private String heatNo;
	private String workOrderNo;
	private Double recQty;
	private Double weighNos;
	private String receipt;
	private String issue;
	private Double accQty;
	private Double condAccQty;
	private String condAccReason;
	private Double rejQty;
	private String rejReason;
	private Double concAccQty;
	private String concAccReason;
	private Double reworkQty;
	private String reworkReason;
	private Double convertQty;
	private String convertReason;
	private String itemStatus;
	private Double unitCumPrice;
	private String batchNo;
	private String batchNoInd;
	private String rINo;
	private String uOM;
	private String remarks;
}
