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
public class Employeepersonalmaster{

	@NonNull
	private String empCode;
	private String empName;
	private String fatherName;
	private String motherName;
	private String phoneNo;
	private String bloodGroup;
	private Date dateOfBirth;
	private String gender;
	private String maritalStatus;
	private String qualification;
	private String empCategory;
	private String remarks;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
	private String branch;
}
