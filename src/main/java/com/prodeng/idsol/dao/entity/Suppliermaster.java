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
public class Suppliermaster{

	@NonNull
	private String supplierCode;
	private String supplierName;
	private String type;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	private String phoneNumber1;
	private String phoneNumber2;
	private String phoneNumber3;
	private String phoneNumber4;
	private String mobileNumber;
	private String faxNumber1;
	private String faxNumber2;
	private String eMailId;
	private String webSite;
	private String certification;
	private String sSINo;
	private String vATNo;
	private String pANNo;
	private String cSTNo;
	private String eCCCode;
	private String contactPerson;
	private String processDesc;
	private Date dateOfInclusion;
	private String status;
	private String methodOfApproval;
	private String evalFreq;
	private String remarks;
	private Integer noOfEmp;
	private String branches;
	private String orgType;
	private Double turnOver;
	private String bankName;
	private String information;
	private String inFavour;
	private String lastUpdatedBy;
	private Date lastUpdatedDate;
	private LocalTime lastUpdatedTime;
}
