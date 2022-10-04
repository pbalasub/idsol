package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Capacityutilisationdetails{

	@NonNull
	private Integer cUId;
	@NonNull
	private Integer serialNo;
	private String cUSection;
	private Double plannedHours;
}
