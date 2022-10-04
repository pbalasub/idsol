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
public class Employeetrainingplan{

	@NonNull
	private Integer eTPId;
	@NonNull
	private String eTPNo;
	private Date eTPDate;
	private String eTPName;
	private Date eTPFromDate;
	private Date eTPTillDate;
	private String remarks;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
