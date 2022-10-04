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
public class Productionplan{

	@NonNull
	private Integer pPId;
	@NonNull
	private String pPNo;
	private String pPName;
	private Date pPDate;
	private String process;
	private Date pPFromDate;
	private Date pPTillDate;
	private String remarks;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
