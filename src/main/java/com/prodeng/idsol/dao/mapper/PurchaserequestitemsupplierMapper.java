package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Purchaserequestitemsupplier;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PurchaserequestitemsupplierMapper{

	@Select ("SELECT * FROM purchaserequestitemsupplier")
	List<Purchaserequestitemsupplier> getAllPurchaserequestitemsupplier();

	@Select ("SELECT * FROM purchaserequestitemsupplier WHERE PRId = #{pRId} AND SerialNo = #{serialNo} AND SuppSerialNo = #{suppSerialNo} ")
	Purchaserequestitemsupplier getPurchaserequestitemsupplier(@Param("pRId") Integer pRId, @Param("serialNo") Integer serialNo, @Param("suppSerialNo") Integer suppSerialNo);

	@Insert ("INSERT INTO purchaserequestitemsupplier(PRId, SerialNo, SuppSerialNo, POGenQty, AlternateUOM, ConvFactor, SupplierCode, UnitPrice, LeadTime, PONo)  VALUES (#{pRId} , #{serialNo} , #{suppSerialNo} , #{pOGenQty} , #{alternateUOM} , #{convFactor} , #{supplierCode} , #{unitPrice} , #{leadTime} , #{pONo} )")
	void  savePurchaserequestitemsupplier(Purchaserequestitemsupplier purchaserequestitemsupplier);

	@Update ("UPDATE  purchaserequestitemsupplier SET POGenQty = #{pOGenQty}, AlternateUOM = #{alternateUOM}, ConvFactor = #{convFactor}, SupplierCode = #{supplierCode}, UnitPrice = #{unitPrice}, LeadTime = #{leadTime}, PONo = #{pONo} WHERE PRId = #{pRId} AND SerialNo = #{serialNo} AND SuppSerialNo = #{suppSerialNo} ")
	void  updatePurchaserequestitemsupplier(@Param("pRId") Integer pRId, @Param("serialNo") Integer serialNo, @Param("suppSerialNo") Integer suppSerialNo);

	@Delete ("DELETE FROM purchaserequestitemsupplier WHERE PRId = #{pRId} AND SerialNo = #{serialNo} AND SuppSerialNo = #{suppSerialNo} ")
	void  deletePurchaserequestitemsupplier(@Param("pRId") Integer pRId, @Param("serialNo") Integer serialNo, @Param("suppSerialNo") Integer suppSerialNo);

    void updatePurchaserequestitemsupplier(Purchaserequestitemsupplier purchaserequestitemsupplier);
}
