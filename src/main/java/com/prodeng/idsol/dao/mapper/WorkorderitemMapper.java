package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Workorderitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface WorkorderitemMapper{

	@Select ("SELECT * FROM workorderitem")
	List<Workorderitem> getAllWorkorderitem();

	@Select ("SELECT * FROM workorderitem WHERE WOId = #{wOId} AND SerialNo = #{serialNo} ")
	Workorderitem getWorkorderitem(@Param("wOId") Integer wOId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO workorderitem(WOId, SerialNo, ItemCode, SpecialChar1, SpecialChar2, SpecialChar3, SpecialChar4, SpecialChar5, WOQtyInNos, WOWeight, WOCompQtyInNos, WOCompWeight, OFNo, OFAccQtyInNos, OFAccWeight, ClosureStatus, WODeliveryDate)  VALUES (#{wOId} , #{serialNo} , #{itemCode} , #{specialChar1} , #{specialChar2} , #{specialChar3} , #{specialChar4} , #{specialChar5} , #{wOQtyInNos} , #{wOWeight} , #{wOCompQtyInNos} , #{wOCompWeight} , #{oFNo} , #{oFAccQtyInNos} , #{oFAccWeight} , #{closureStatus} , #{wODeliveryDate} )")
	void  saveWorkorderitem(Workorderitem workorderitem);

	@Update ("UPDATE  workorderitem SET ItemCode = #{itemCode}, SpecialChar1 = #{specialChar1}, SpecialChar2 = #{specialChar2}, SpecialChar3 = #{specialChar3}, SpecialChar4 = #{specialChar4}, SpecialChar5 = #{specialChar5}, WOQtyInNos = #{wOQtyInNos}, WOWeight = #{wOWeight}, WOCompQtyInNos = #{wOCompQtyInNos}, WOCompWeight = #{wOCompWeight}, OFNo = #{oFNo}, OFAccQtyInNos = #{oFAccQtyInNos}, OFAccWeight = #{oFAccWeight}, ClosureStatus = #{closureStatus}, WODeliveryDate = #{wODeliveryDate} WHERE WOId = #{wOId} AND SerialNo = #{serialNo} ")
	void  updateWorkorderitem(@Param("wOId") Integer wOId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM workorderitem WHERE WOId = #{wOId} AND SerialNo = #{serialNo} ")
	void  deleteWorkorderitem(@Param("wOId") Integer wOId, @Param("serialNo") Integer serialNo);

    void updateWorkorderitem(Workorderitem workorderitem);
}
