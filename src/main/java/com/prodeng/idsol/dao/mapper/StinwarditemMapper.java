package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Stinwarditem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StinwarditemMapper{

	@Select ("SELECT * FROM stinwarditem")
	List<Stinwarditem> getAllStinwarditem();

	@Select ("SELECT * FROM stinwarditem WHERE InwardId = #{inwardId} AND SerialNo = #{serialNo} ")
	Stinwarditem getStinwarditem(@Param("inwardId") Integer inwardId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO stinwarditem(InwardId, SerialNo, ItemCode, DCQty, HeatNo, WorkOrderNo, RecQty, WeighNos, Receipt, Issue, AccQty, CondAccQty, CondAccReason, RejQty, RejReason, ConcAccQty, ConcAccReason, ReworkQty, ReworkReason, ConvertQty, ConvertReason, ItemStatus, UnitCumPrice, BatchNo, BatchNoInd, RINo, UOM, Remarks)  VALUES (#{inwardId} , #{serialNo} , #{itemCode} , #{dCQty} , #{heatNo} , #{workOrderNo} , #{recQty} , #{weighNos} , #{receipt} , #{issue} , #{accQty} , #{condAccQty} , #{condAccReason} , #{rejQty} , #{rejReason} , #{concAccQty} , #{concAccReason} , #{reworkQty} , #{reworkReason} , #{convertQty} , #{convertReason} , #{itemStatus} , #{unitCumPrice} , #{batchNo} , #{batchNoInd} , #{rINo} , #{uOM} , #{remarks} )")
	void  saveStinwarditem(Stinwarditem stinwarditem);

	@Update ("UPDATE  stinwarditem SET ItemCode = #{itemCode}, DCQty = #{dCQty}, HeatNo = #{heatNo}, WorkOrderNo = #{workOrderNo}, RecQty = #{recQty}, WeighNos = #{weighNos}, Receipt = #{receipt}, Issue = #{issue}, AccQty = #{accQty}, CondAccQty = #{condAccQty}, CondAccReason = #{condAccReason}, RejQty = #{rejQty}, RejReason = #{rejReason}, ConcAccQty = #{concAccQty}, ConcAccReason = #{concAccReason}, ReworkQty = #{reworkQty}, ReworkReason = #{reworkReason}, ConvertQty = #{convertQty}, ConvertReason = #{convertReason}, ItemStatus = #{itemStatus}, UnitCumPrice = #{unitCumPrice}, BatchNo = #{batchNo}, BatchNoInd = #{batchNoInd}, RINo = #{rINo}, UOM = #{uOM}, Remarks = #{remarks} WHERE InwardId = #{inwardId} AND SerialNo = #{serialNo} ")
	void  updateStinwarditem(@Param("inwardId") Integer inwardId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM stinwarditem WHERE InwardId = #{inwardId} AND SerialNo = #{serialNo} ")
	void  deleteStinwarditem(@Param("inwardId") Integer inwardId, @Param("serialNo") Integer serialNo);

    void updateStinwarditem(Stinwarditem stinwarditem);
}
