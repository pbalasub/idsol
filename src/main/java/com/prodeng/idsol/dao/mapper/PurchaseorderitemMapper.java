package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Purchaseorderitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PurchaseorderitemMapper{

	@Select ("SELECT * FROM purchaseorderitem")
	List<Purchaseorderitem> getAllPurchaseorderitem();

	@Select ("SELECT * FROM purchaseorderitem WHERE POId = #{pOId} AND SerialNo = #{serialNo} ")
	Purchaseorderitem getPurchaseorderitem(@Param("pOId") Integer pOId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO purchaseorderitem(POId, SerialNo, ItemCode, POQty, ReqLatestDays, ReqLatestDate, ItemRate, CashDisc, TotalRate, Colour, Process, AlternateUOM, ConvFactor, UnitPrice, Discount, PackageForward, ExciseDuty, VAT, ServiceTax, Insurance, POAccQty, PoRejQty, inwardno, LastInwardDate, DpResult, Freight)  VALUES (#{pOId} , #{serialNo} , #{itemCode} , #{pOQty} , #{reqLatestDays} , #{reqLatestDate} , #{itemRate} , #{cashDisc} , #{totalRate} , #{colour} , #{process} , #{alternateUOM} , #{convFactor} , #{unitPrice} , #{discount} , #{packageForward} , #{exciseDuty} , #{vAT} , #{serviceTax} , #{insurance} , #{pOAccQty} , #{poRejQty} , #{inwardno} , #{lastInwardDate} , #{dpResult} , #{freight} )")
	void  savePurchaseorderitem(Purchaseorderitem purchaseorderitem);

	@Update ("UPDATE  purchaseorderitem SET ItemCode = #{itemCode}, POQty = #{pOQty}, ReqLatestDays = #{reqLatestDays}, ReqLatestDate = #{reqLatestDate}, ItemRate = #{itemRate}, CashDisc = #{cashDisc}, TotalRate = #{totalRate}, Colour = #{colour}, Process = #{process}, AlternateUOM = #{alternateUOM}, ConvFactor = #{convFactor}, UnitPrice = #{unitPrice}, Discount = #{discount}, PackageForward = #{packageForward}, ExciseDuty = #{exciseDuty}, VAT = #{vAT}, ServiceTax = #{serviceTax}, Insurance = #{insurance}, POAccQty = #{pOAccQty}, PoRejQty = #{poRejQty}, inwardno = #{inwardno}, LastInwardDate = #{lastInwardDate}, DpResult = #{dpResult}, Freight = #{freight} WHERE POId = #{pOId} AND SerialNo = #{serialNo} ")
	void  updatePurchaseorderitem(@Param("pOId") Integer pOId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM purchaseorderitem WHERE POId = #{pOId} AND SerialNo = #{serialNo} ")
	void  deletePurchaseorderitem(@Param("pOId") Integer pOId, @Param("serialNo") Integer serialNo);

    void updatePurchaseorderitem(Purchaseorderitem purchaseorderitem);
}
