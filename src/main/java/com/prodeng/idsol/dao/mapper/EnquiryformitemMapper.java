package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Enquiryformitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EnquiryformitemMapper{

	@Select ("SELECT * FROM enquiryformitem")
	List<Enquiryformitem> getAllEnquiryformitem();

	@Select ("SELECT * FROM enquiryformitem WHERE EnquiryId = #{enquiryId} AND SerialNo = #{serialNo} ")
	Enquiryformitem getEnquiryformitem(@Param("enquiryId") Integer enquiryId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO enquiryformitem(EnquiryId, SerialNo, ItemCode, ProcessFrom, ProcessTo, EQYQty, UnitPrice, Discount, VATPercent, CSTPercent, ExcisePercent, ServiceTaxPercent, PackageForward, Advance, Warranty, LeadTime, Insurance, SupplierUOM, ConvFactor, CashDiscPercent)  VALUES (#{enquiryId} , #{serialNo} , #{itemCode} , #{processFrom} , #{processTo} , #{eQYQty} , #{unitPrice} , #{discount} , #{vATPercent} , #{cSTPercent} , #{excisePercent} , #{serviceTaxPercent} , #{packageForward} , #{advance} , #{warranty} , #{leadTime} , #{insurance} , #{supplierUOM} , #{convFactor} , #{cashDiscPercent} )")
	void  saveEnquiryformitem(Enquiryformitem enquiryformitem);

	@Update ("UPDATE  enquiryformitem SET ItemCode = #{itemCode}, ProcessFrom = #{processFrom}, ProcessTo = #{processTo}, EQYQty = #{eQYQty}, UnitPrice = #{unitPrice}, Discount = #{discount}, VATPercent = #{vATPercent}, CSTPercent = #{cSTPercent}, ExcisePercent = #{excisePercent}, ServiceTaxPercent = #{serviceTaxPercent}, PackageForward = #{packageForward}, Advance = #{advance}, Warranty = #{warranty}, LeadTime = #{leadTime}, Insurance = #{insurance}, SupplierUOM = #{supplierUOM}, ConvFactor = #{convFactor}, CashDiscPercent = #{cashDiscPercent} WHERE EnquiryId = #{enquiryId} AND SerialNo = #{serialNo} ")
	void  updateEnquiryformitem(@Param("enquiryId") Integer enquiryId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM enquiryformitem WHERE EnquiryId = #{enquiryId} AND SerialNo = #{serialNo} ")
	void  deleteEnquiryformitem(@Param("enquiryId") Integer enquiryId, @Param("serialNo") Integer serialNo);

    void updateEnquiryformitem(Enquiryformitem enquiryformitem);
}
