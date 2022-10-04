package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Repairworkorderitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface RepairworkorderitemMapper{

	@Select ("SELECT * FROM repairworkorderitem")
	List<Repairworkorderitem> getAllRepairworkorderitem();

	@Select ("SELECT * FROM repairworkorderitem WHERE RWOId = #{rWOId} AND SerialNo = #{serialNo} ")
	Repairworkorderitem getRepairworkorderitem(@Param("rWOId") Integer rWOId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO repairworkorderitem(RWOId, SerialNo, ItemCode, ProcessFrom, ProcessTo, HistoryCode, RWOQty, ReqLatestDays, ReqLatestDate, ItemRate, Discount, CashDisc, TotalRate, FromDate, ToDate, UnitPrice)  VALUES (#{rWOId} , #{serialNo} , #{itemCode} , #{processFrom} , #{processTo} , #{historyCode} , #{rWOQty} , #{reqLatestDays} , #{reqLatestDate} , #{itemRate} , #{discount} , #{cashDisc} , #{totalRate} , #{fromDate} , #{toDate} , #{unitPrice} )")
	void  saveRepairworkorderitem(Repairworkorderitem repairworkorderitem);

	@Update ("UPDATE  repairworkorderitem SET ItemCode = #{itemCode}, ProcessFrom = #{processFrom}, ProcessTo = #{processTo}, HistoryCode = #{historyCode}, RWOQty = #{rWOQty}, ReqLatestDays = #{reqLatestDays}, ReqLatestDate = #{reqLatestDate}, ItemRate = #{itemRate}, Discount = #{discount}, CashDisc = #{cashDisc}, TotalRate = #{totalRate}, FromDate = #{fromDate}, ToDate = #{toDate}, UnitPrice = #{unitPrice} WHERE RWOId = #{rWOId} AND SerialNo = #{serialNo} ")
	void  updateRepairworkorderitem(@Param("rWOId") Integer rWOId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM repairworkorderitem WHERE RWOId = #{rWOId} AND SerialNo = #{serialNo} ")
	void  deleteRepairworkorderitem(@Param("rWOId") Integer rWOId, @Param("serialNo") Integer serialNo);

    void updateRepairworkorderitem(Repairworkorderitem repairworkorderitem);
}
