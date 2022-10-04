package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Issuereceiptitem{

	@NonNull
	private Integer iRId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private String referenceNo;
	private String processedState;
	private String specialChar1;
	private String specialChar2;
	private String specialChar3;
	private String specialChar4;
	private String specialChar5;
	private Double iRQtyInNos;
	private Double iRWeight;
	private Double rejQtyInNos;
	private Double rejWeight;
	private Double nCQtyInNos;
	private Double nCWeight;
	private Double accQtyInNos;
	private Double accWeight;
	private Double reworkQtyInNos;
	private Double reworkWeight;
}
