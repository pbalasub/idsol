package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Receivinginspectiondispersion{

	@NonNull
	private Integer rIId;
	private String segregationAt;
	private Double segregationQty;
	private Double acceptedQty;
	private String acceptedDetails;
	private Double rejectedQty;
	private String rejectedDetails;
	private Double accConcessionQty;
	private String accConcessionDetails;
	private Double accConditionQty;
	private String accConditionDetails;
}
