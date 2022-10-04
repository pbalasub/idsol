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
public class Loginuser{

	@NonNull
	private String userId;
	private String password;
	private String dept;
	private String userName;
	private String empCode;
	private String empName;
	private String superUser;
	private String loggedIn;
	private Date loggedInTime;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
	private String sectionCode;
}
