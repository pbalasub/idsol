package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Itemmaster{

	@NonNull
	private String itemCode;
	private String itemDescription;
	private String mainCategory;
	private String subCategory;
	private String uOM;
	private String specification;
	private String drawingNo;
	private String iACCode;
	private String location;
	private String isVendorRatingItem;
	private String isStockListItem;
	private String isSelfLifeItem;
	private Double reOrderLevel;
	private Double reOrderQty;
	private Integer maxQty;
	private Integer minQty;
	private Integer reviewPeriod;
	private Double openBalance;
	private String custItemCode;
	private Double length;
	private Double weight;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
	private String accountHead;
	private String rMRefItemCode;
	private Double processMinWeight;
	private Double processMaxWeight;
	private Double processAverageWeight;
	private Integer toolLifePlanned;
	private String reOrderProcessCode;
	private Date openBalanceDate;
	private String customerCode;
	private String hsnCode;
	private String others;
}
