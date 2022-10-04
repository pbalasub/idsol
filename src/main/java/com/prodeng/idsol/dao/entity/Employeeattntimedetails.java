package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employeeattntimedetails{

	private Integer empId;
	@NonNull
	private String empCode;
	@NonNull
	private Date attnDate;
	@NonNull
	private String attnTime;
	private Integer tnsId;
	private String trnsBarCode;
}
