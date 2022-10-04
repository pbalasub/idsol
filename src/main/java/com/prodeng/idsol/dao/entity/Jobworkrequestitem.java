package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Jobworkrequestitem{

	@NonNull
	private Integer jWRId;
	@NonNull
	private Integer serialNo;
	private String processFrom;
	private String processTo;
	private Integer reqLatestDays;
	private Date reqLatestDate;
	private String purpose;
	private String rejReason;
}
