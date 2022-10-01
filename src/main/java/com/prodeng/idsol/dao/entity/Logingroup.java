package com.prodeng.idsol.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "HH:mm:ss[.SSS][.SS][.S]")
	private LocalTime lastUpdatedTime;

}
