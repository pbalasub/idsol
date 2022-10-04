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
public class Mtcecharplan{

	@NonNull
	private Integer cPId;
	@NonNull
	private String cPNo;
	private Date cPDate;
	private String revision;
	private String cPStatus;
	private String historyCode;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
