package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Supplieritemprice;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface SupplieritempriceMapper{

	@Select ("SELECT * FROM supplieritemprice")
	List<Supplieritemprice> getAllSupplieritemprice();

	@Select ("SELECT * FROM supplieritemprice WHERE SupplierCode = #{supplierCode} AND ItemCode = #{itemCode} AND ProcessFrom = #{processFrom} AND ProcessTo = #{processTo} ")
	Supplieritemprice getSupplieritemprice(@Param("supplierCode") String supplierCode, @Param("itemCode") String itemCode, @Param("processFrom") String processFrom, @Param("processTo") String processTo);

	@Insert ("INSERT INTO supplieritemprice(SupplierCode, ItemCode, ProcessFrom, ProcessTo, LeadTime, UnitPrice, DiscPercent, Advance, CashDiscPercent, VatPercent, ExcisePercent, PackageForward, CSTPercent, ServiceTaxPercent, InsurancePercent, UOM, AlternateUOM, ConvFactor, RateValidFrom, RateValidTo, OurRef, YourRef, Warranty, IssuedDrawing, IssuedDate, ReceivedDrawing, ReceivedDate, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{supplierCode} , #{itemCode} , #{processFrom} , #{processTo} , #{leadTime} , #{unitPrice} , #{discPercent} , #{advance} , #{cashDiscPercent} , #{vatPercent} , #{excisePercent} , #{packageForward} , #{cSTPercent} , #{serviceTaxPercent} , #{insurancePercent} , #{uOM} , #{alternateUOM} , #{convFactor} , #{rateValidFrom} , #{rateValidTo} , #{ourRef} , #{yourRef} , #{warranty} , #{issuedDrawing} , #{issuedDate} , #{receivedDrawing} , #{receivedDate} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveSupplieritemprice(Supplieritemprice supplieritemprice);

	@Update ("UPDATE  supplieritemprice SET LeadTime = #{leadTime}, UnitPrice = #{unitPrice}, DiscPercent = #{discPercent}, Advance = #{advance}, CashDiscPercent = #{cashDiscPercent}, VatPercent = #{vatPercent}, ExcisePercent = #{excisePercent}, PackageForward = #{packageForward}, CSTPercent = #{cSTPercent}, ServiceTaxPercent = #{serviceTaxPercent}, InsurancePercent = #{insurancePercent}, UOM = #{uOM}, AlternateUOM = #{alternateUOM}, ConvFactor = #{convFactor}, RateValidFrom = #{rateValidFrom}, RateValidTo = #{rateValidTo}, OurRef = #{ourRef}, YourRef = #{yourRef}, Warranty = #{warranty}, IssuedDrawing = #{issuedDrawing}, IssuedDate = #{issuedDate}, ReceivedDrawing = #{receivedDrawing}, ReceivedDate = #{receivedDate}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE SupplierCode = #{supplierCode} AND ItemCode = #{itemCode} AND ProcessFrom = #{processFrom} AND ProcessTo = #{processTo} ")
	void  updateSupplieritemprice(@Param("supplierCode") String supplierCode, @Param("itemCode") String itemCode, @Param("processFrom") String processFrom, @Param("processTo") String processTo);

	@Delete ("DELETE FROM supplieritemprice WHERE SupplierCode = #{supplierCode} AND ItemCode = #{itemCode} AND ProcessFrom = #{processFrom} AND ProcessTo = #{processTo} ")
	void  deleteSupplieritemprice(@Param("supplierCode") String supplierCode, @Param("itemCode") String itemCode, @Param("processFrom") String processFrom, @Param("processTo") String processTo);

    void updateSupplieritemprice(Supplieritemprice supplieritemprice);
}
