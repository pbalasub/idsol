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
public class Expenditurebudgetplan{

	@NonNull
	private Integer eBPId;
	@NonNull
	private String eBPNo;
	private Date eBPDate;
	private String eBPName;
	private Integer fromYear;
	private Integer tillYear;
	private String remarks;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
