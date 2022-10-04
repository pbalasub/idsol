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
public class Menucomponent{

	@NonNull
	private Integer componentId;
	@NonNull
	private Integer parentId;
	private String linkType;
	private String linkName;
	private String linkURL;
	private Integer orderSeq;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
