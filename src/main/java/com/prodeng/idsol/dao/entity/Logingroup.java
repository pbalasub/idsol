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
public class Logingroup{

	@NonNull
	private String groupCode;
	private String groupName;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
