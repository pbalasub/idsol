package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Openingbalancemaster{

	@NonNull
	private String param1;
	@NonNull
	private String param2;
	@NonNull
	private String param3;
	@NonNull
	private String param4;
	@NonNull
	private String param5;
	@NonNull
	private String param6;
	@NonNull
	private String identityType;
	@NonNull
	private Integer month;
	@NonNull
	private Integer year;
	private Double openingBalance;
	private String updatedHistory;
	private String nameOfLastUpdate;
	private Date dateOfLastUpdate;
}
