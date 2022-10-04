package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Purchaserequestitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PurchaserequestitemMapper{

	@Select ("SELECT * FROM purchaserequestitem")
	List<Purchaserequestitem> getAllPurchaserequestitem();

	@Select ("SELECT * FROM purchaserequestitem WHERE PRId = #{pRId} AND SerialNo = #{serialNo} ")
	Purchaserequestitem getPurchaserequestitem(@Param("pRId") Integer pRId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO purchaserequestitem(PRId, SerialNo, ItemCode, PRQty, ReqLatestDays, ReqLatestDate, Purpose, RejReason, SupplierCode, Colour, Process, UOM)  VALUES (#{pRId} , #{serialNo} , #{itemCode} , #{pRQty} , #{reqLatestDays} , #{reqLatestDate} , #{purpose} , #{rejReason} , #{supplierCode} , #{colour} , #{process} , #{uOM} )")
	void  savePurchaserequestitem(Purchaserequestitem purchaserequestitem);

	@Update ("UPDATE  purchaserequestitem SET ItemCode = #{itemCode}, PRQty = #{pRQty}, ReqLatestDays = #{reqLatestDays}, ReqLatestDate = #{reqLatestDate}, Purpose = #{purpose}, RejReason = #{rejReason}, SupplierCode = #{supplierCode}, Colour = #{colour}, Process = #{process}, UOM = #{uOM} WHERE PRId = #{pRId} AND SerialNo = #{serialNo} ")
	void  updatePurchaserequestitem(@Param("pRId") Integer pRId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM purchaserequestitem WHERE PRId = #{pRId} AND SerialNo = #{serialNo} ")
	void  deletePurchaserequestitem(@Param("pRId") Integer pRId, @Param("serialNo") Integer serialNo);

    void updatePurchaserequestitem(Purchaserequestitem purchaserequestitem);
}
