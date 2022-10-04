package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Repairworkrequestitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface RepairworkrequestitemMapper{

	@Select ("SELECT * FROM repairworkrequestitem")
	List<Repairworkrequestitem> getAllRepairworkrequestitem();

	@Select ("SELECT * FROM repairworkrequestitem WHERE RWRId = #{rWRId} AND SerialNo = #{serialNo} ")
	Repairworkrequestitem getRepairworkrequestitem(@Param("rWRId") Integer rWRId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO repairworkrequestitem(RWRId, SerialNo, ItemCode, ProcessFrom, ProcessTo, RWRQty, ReqLatestDays, ReqLatestDate, Purpose, HistoryCode, RejReason, SupplierCode)  VALUES (#{rWRId} , #{serialNo} , #{itemCode} , #{processFrom} , #{processTo} , #{rWRQty} , #{reqLatestDays} , #{reqLatestDate} , #{purpose} , #{historyCode} , #{rejReason} , #{supplierCode} )")
	void  saveRepairworkrequestitem(Repairworkrequestitem repairworkrequestitem);

	@Update ("UPDATE  repairworkrequestitem SET ItemCode = #{itemCode}, ProcessFrom = #{processFrom}, ProcessTo = #{processTo}, RWRQty = #{rWRQty}, ReqLatestDays = #{reqLatestDays}, ReqLatestDate = #{reqLatestDate}, Purpose = #{purpose}, HistoryCode = #{historyCode}, RejReason = #{rejReason}, SupplierCode = #{supplierCode} WHERE RWRId = #{rWRId} AND SerialNo = #{serialNo} ")
	void  updateRepairworkrequestitem(@Param("rWRId") Integer rWRId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM repairworkrequestitem WHERE RWRId = #{rWRId} AND SerialNo = #{serialNo} ")
	void  deleteRepairworkrequestitem(@Param("rWRId") Integer rWRId, @Param("serialNo") Integer serialNo);

    void updateRepairworkrequestitem(Repairworkrequestitem repairworkrequestitem);
}
