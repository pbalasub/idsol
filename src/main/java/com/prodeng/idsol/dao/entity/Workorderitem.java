package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Workorderitem{

	@NonNull
	private Integer wOId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private String specialChar1;
	private String specialChar2;
	private String specialChar3;
	private String specialChar4;
	private String specialChar5;
	private Double wOQtyInNos;
	private Double wOWeight;
	private Double wOCompQtyInNos;
	private Double wOCompWeight;
	private String oFNo;
	private Double oFAccQtyInNos;
	private Double oFAccWeight;
	private String closureStatus;
	private Date wODeliveryDate;
}
