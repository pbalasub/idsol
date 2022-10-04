package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Groupmenucomponentdetails{

	@NonNull
	private String groupCode;
	@NonNull
	private Integer serialNo;
	private Integer componentId;
}
