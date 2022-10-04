package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Purchaserequestitemsupplier{

	@NonNull
	private Integer pRId;
	@NonNull
	private Integer serialNo;
	@NonNull
	private Integer suppSerialNo;
	private Double pOGenQty;
	private String alternateUOM;
	private Double convFactor;
	private String supplierCode;
	private Double unitPrice;
	private Integer leadTime;
	private String pONo;
}
