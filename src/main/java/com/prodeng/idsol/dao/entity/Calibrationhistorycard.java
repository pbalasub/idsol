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
public class Calibrationhistorycard{

	@NonNull
	private Integer cHCId;
	@NonNull
	private String historyCode;
	private Date cHCDate;
	private String calibrationAt;
	private String acceptanceCriteria;
	private String leastCount;
	private String frequency;
	private String locationUsed;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
