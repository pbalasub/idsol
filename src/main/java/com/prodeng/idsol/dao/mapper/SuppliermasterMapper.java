package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Suppliermaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface SuppliermasterMapper{

	@Select ("SELECT * FROM suppliermaster")
	List<Suppliermaster> getAllSuppliermaster();

	@Select ("SELECT * FROM suppliermaster WHERE SupplierCode = #{supplierCode} ")
	Suppliermaster getSuppliermaster(@Param("supplierCode") String supplierCode);

	@Insert ("INSERT INTO suppliermaster(SupplierCode, SupplierName, Type, AddressLine1, AddressLine2, City, State, Country, PinCode, PhoneNumber1, PhoneNumber2, PhoneNumber3, PhoneNumber4, MobileNumber, FaxNumber1, FaxNumber2, EMailId, WebSite, Certification, SSINo, VATNo, PANNo, CSTNo, ECCCode, ContactPerson, ProcessDesc, DateOfInclusion, Status, MethodOfApproval, EvalFreq, Remarks, NoOfEmp, Branches, OrgType, TurnOver, BankName, Information, InFavour, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{supplierCode} , #{supplierName} , #{type} , #{addressLine1} , #{addressLine2} , #{city} , #{state} , #{country} , #{pinCode} , #{phoneNumber1} , #{phoneNumber2} , #{phoneNumber3} , #{phoneNumber4} , #{mobileNumber} , #{faxNumber1} , #{faxNumber2} , #{eMailId} , #{webSite} , #{certification} , #{sSINo} , #{vATNo} , #{pANNo} , #{cSTNo} , #{eCCCode} , #{contactPerson} , #{processDesc} , #{dateOfInclusion} , #{status} , #{methodOfApproval} , #{evalFreq} , #{remarks} , #{noOfEmp} , #{branches} , #{orgType} , #{turnOver} , #{bankName} , #{information} , #{inFavour} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveSuppliermaster(Suppliermaster suppliermaster);

	@Update ("UPDATE  suppliermaster SET SupplierName = #{supplierName}, Type = #{type}, AddressLine1 = #{addressLine1}, AddressLine2 = #{addressLine2}, City = #{city}, State = #{state}, Country = #{country}, PinCode = #{pinCode}, PhoneNumber1 = #{phoneNumber1}, PhoneNumber2 = #{phoneNumber2}, PhoneNumber3 = #{phoneNumber3}, PhoneNumber4 = #{phoneNumber4}, MobileNumber = #{mobileNumber}, FaxNumber1 = #{faxNumber1}, FaxNumber2 = #{faxNumber2}, EMailId = #{eMailId}, WebSite = #{webSite}, Certification = #{certification}, SSINo = #{sSINo}, VATNo = #{vATNo}, PANNo = #{pANNo}, CSTNo = #{cSTNo}, ECCCode = #{eCCCode}, ContactPerson = #{contactPerson}, ProcessDesc = #{processDesc}, DateOfInclusion = #{dateOfInclusion}, Status = #{status}, MethodOfApproval = #{methodOfApproval}, EvalFreq = #{evalFreq}, Remarks = #{remarks}, NoOfEmp = #{noOfEmp}, Branches = #{branches}, OrgType = #{orgType}, TurnOver = #{turnOver}, BankName = #{bankName}, Information = #{information}, InFavour = #{inFavour}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE SupplierCode = #{supplierCode} ")
	void  updateSuppliermaster(@Param("supplierCode") String supplierCode);

	@Delete ("DELETE FROM suppliermaster WHERE SupplierCode = #{supplierCode} ")
	void  deleteSuppliermaster(@Param("supplierCode") String supplierCode);

}
