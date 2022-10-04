package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Issuereceiptitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface IssuereceiptitemMapper{

	@Select ("SELECT * FROM issuereceiptitem")
	List<Issuereceiptitem> getAllIssuereceiptitem();

	@Select ("SELECT * FROM issuereceiptitem WHERE IRId = #{iRId} AND SerialNo = #{serialNo} ")
	Issuereceiptitem getIssuereceiptitem(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO issuereceiptitem(IRId, SerialNo, ItemCode, ReferenceNo, ProcessedState, SpecialChar1, SpecialChar2, SpecialChar3, SpecialChar4, SpecialChar5, IRQtyInNos, IRWeight, RejQtyInNos, RejWeight, NCQtyInNos, NCWeight, AccQtyInNos, AccWeight, ReworkQtyInNos, ReworkWeight)  VALUES (#{iRId} , #{serialNo} , #{itemCode} , #{referenceNo} , #{processedState} , #{specialChar1} , #{specialChar2} , #{specialChar3} , #{specialChar4} , #{specialChar5} , #{iRQtyInNos} , #{iRWeight} , #{rejQtyInNos} , #{rejWeight} , #{nCQtyInNos} , #{nCWeight} , #{accQtyInNos} , #{accWeight} , #{reworkQtyInNos} , #{reworkWeight} )")
	void  saveIssuereceiptitem(Issuereceiptitem issuereceiptitem);

	@Update ("UPDATE  issuereceiptitem SET ItemCode = #{itemCode}, ReferenceNo = #{referenceNo}, ProcessedState = #{processedState}, SpecialChar1 = #{specialChar1}, SpecialChar2 = #{specialChar2}, SpecialChar3 = #{specialChar3}, SpecialChar4 = #{specialChar4}, SpecialChar5 = #{specialChar5}, IRQtyInNos = #{iRQtyInNos}, IRWeight = #{iRWeight}, RejQtyInNos = #{rejQtyInNos}, RejWeight = #{rejWeight}, NCQtyInNos = #{nCQtyInNos}, NCWeight = #{nCWeight}, AccQtyInNos = #{accQtyInNos}, AccWeight = #{accWeight}, ReworkQtyInNos = #{reworkQtyInNos}, ReworkWeight = #{reworkWeight} WHERE IRId = #{iRId} AND SerialNo = #{serialNo} ")
	void  updateIssuereceiptitem(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM issuereceiptitem WHERE IRId = #{iRId} AND SerialNo = #{serialNo} ")
	void  deleteIssuereceiptitem(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo);

    void updateIssuereceiptitem(Issuereceiptitem issuereceiptitem);
}
