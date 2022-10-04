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
public class Capacityutilisation{

	@NonNull
	private Integer cUId;
	@NonNull
	private String cUNo;
	private Date cUDate;
	private String cUName;
	private Date cUFromDate;
	private Date cUTillDate;
	private String remarks;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
