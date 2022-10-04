package com.prodeng.idsol.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Seqgen{

	@NonNull
	private String prefix;
	@NonNull
	private String seqType;
	private Integer initCounter;
	private Integer nextNum;
	private Integer incrementBy;
}
