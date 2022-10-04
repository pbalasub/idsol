package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Stdeliverychallanitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StdeliverychallanitemMapper{

	@Select ("SELECT * FROM stdeliverychallanitem")
	List<Stdeliverychallanitem> getAllStdeliverychallanitem();

	@Select ("SELECT * FROM stdeliverychallanitem WHERE DCId = #{dCId} AND SerialNo = #{serialNo} ")
	Stdeliverychallanitem getStdeliverychallanitem(@Param("dCId") Integer dCId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO stdeliverychallanitem(DCId, SerialNo, ItemCode, DCQty, AlternateQty, ReferenceNo, CustOrderNo, WorkOrderNo, Purpose, ItemRemarks, Issue, Receipt, DcAccQty, DcRejQty, inwardno, LastInwardDate, DpResult, DeliveryDate)  VALUES (#{dCId} , #{serialNo} , #{itemCode} , #{dCQty} , #{alternateQty} , #{referenceNo} , #{custOrderNo} , #{workOrderNo} , #{purpose} , #{itemRemarks} , #{issue} , #{receipt} , #{dcAccQty} , #{dcRejQty} , #{inwardno} , #{lastInwardDate} , #{dpResult} , #{deliveryDate} )")
	void  saveStdeliverychallanitem(Stdeliverychallanitem stdeliverychallanitem);

	@Update ("UPDATE  stdeliverychallanitem SET ItemCode = #{itemCode}, DCQty = #{dCQty}, AlternateQty = #{alternateQty}, ReferenceNo = #{referenceNo}, CustOrderNo = #{custOrderNo}, WorkOrderNo = #{workOrderNo}, Purpose = #{purpose}, ItemRemarks = #{itemRemarks}, Issue = #{issue}, Receipt = #{receipt}, DcAccQty = #{dcAccQty}, DcRejQty = #{dcRejQty}, inwardno = #{inwardno}, LastInwardDate = #{lastInwardDate}, DpResult = #{dpResult}, DeliveryDate = #{deliveryDate} WHERE DCId = #{dCId} AND SerialNo = #{serialNo} ")
	void  updateStdeliverychallanitem(@Param("dCId") Integer dCId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM stdeliverychallanitem WHERE DCId = #{dCId} AND SerialNo = #{serialNo} ")
	void  deleteStdeliverychallanitem(@Param("dCId") Integer dCId, @Param("serialNo") Integer serialNo);

    void updateStdeliverychallanitem(Stdeliverychallanitem stdeliverychallanitem);
}
