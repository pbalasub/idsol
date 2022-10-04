package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Codevaluemasteritem{

	@NonNull
	private Integer identifier;
	@NonNull
	private String code;
	private String value;
	private Integer orderSeq;
}
