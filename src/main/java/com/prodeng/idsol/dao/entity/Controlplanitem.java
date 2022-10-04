package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Controlplanitem{

	@NonNull
	private Integer cPId;
	@NonNull
	private Integer serialNo;
	private String drwgSlNo;
	private String characteristics;
	private String specialChar;
	private Double minSpec;
	private Double maxSpec;
	private String evalTech;
	private String device;
	private String frequency;
	private String controlMethod;
	private String reactionPlan;
	private String processDetail;
	private String uom;
}
