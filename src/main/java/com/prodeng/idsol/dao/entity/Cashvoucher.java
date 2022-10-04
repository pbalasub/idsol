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
public class Cashvoucher{

	@NonNull
	private Integer cVId;
	private String cVNo;
	private String cVType;
	private Date cVDate;
	private String cVDueTo;
	private String empCode;
	private String supplierCode;
	private String supplierRepName;
	private Double amountRequested;
	private Double amountGranted;
	private String reason;
	private Double amountPaid;
	private Double receiptAmount;
	private String voucherStatus;
	private String remarks;
	private Double totalAmount;
	private String totalAmountInWords;
	private String rejectReason;
	private String comments;
	private String status;
	private String stage;
	private String stageOneName;
	private Date stageOneDate;
	private LocalTime stageOneTime;
	private String stageTwoName;
	private Date stageTwoDate;
	private LocalTime stageTwoTime;
	private String stageThreeName;
	private Date stageThreeDate;
	private LocalTime stageThreeTime;
	private String chequeNo;
	private Date chequeDate;
	private Double chequeAmount;
	private String chequeAmountInWords;
	private String bankName;
	private String branchName;
	private String bankAccountNo;
}
