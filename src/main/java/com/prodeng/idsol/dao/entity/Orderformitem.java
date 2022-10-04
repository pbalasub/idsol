package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orderformitem{

	@NonNull
	private Integer oFId;
	@NonNull
	private Integer serialNo;
	private String itemCode;
	private Double oFQtyInNos;
	private Double oFWeight;
	private Date deliveryDate;
	private String specialChar1;
	private String specialChar2;
	private String specialChar3;
	private String specialChar4;
	private String specialChar5;
	private Double accQtyInNos;
	private Double accWeight;
	private Date accDeliveryDate;
	private String reason;
}
