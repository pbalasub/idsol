package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orderitem{

	@NonNull
	private String oFNo;
	@NonNull
	private String itemCode;
	@NonNull
	private String specialChar1;
	@NonNull
	private String specialChar2;
	@NonNull
	private String specialChar3;
	@NonNull
	private String specialChar4;
	@NonNull
	private String specialChar5;
	private Double accQtyInNos;
	private Double accWeight;
	private Double plannedWOGenQty;
	private Double plannedWOGenWeight;
	private Double wOGenQty;
	private Double wOGenWeight;
	private String closureStatus;
	private Date oFAccDeliveryDate;
}
