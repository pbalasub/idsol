package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Finalinspectionreportitem{

	@NonNull
	private Integer fIRId;
	@NonNull
	private Integer serialNo;
	private String drwgSlNo;
	private String characteristics;
	private String specialChar;
	private String evalTech;
	private Double minSpec;
	private Double maxSpec;
	private Double observedMinSpec;
	private Double observedMaxSpec;
	private String remarks;
	private Double job1;
	private Double job2;
	private Double job3;
	private Double job4;
	private Double job5;
}
