package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Issuereceiptitemseg;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface IssuereceiptitemsegMapper{

	@Select ("SELECT * FROM issuereceiptitemseg")
	List<Issuereceiptitemseg> getAllIssuereceiptitemseg();

	@Select ("SELECT * FROM issuereceiptitemseg WHERE IRId = #{iRId} AND SerialNo = #{serialNo} AND SegType = #{segType} AND Characteristics = #{characteristics} ")
	Issuereceiptitemseg getIssuereceiptitemseg(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo, @Param("segType") String segType, @Param("characteristics") String characteristics);

	@Insert ("INSERT INTO issuereceiptitemseg(IRId, SerialNo, SegType, Characteristics, QtyInNos, Reason, Identity)  VALUES (#{iRId} , #{serialNo} , #{segType} , #{characteristics} , #{qtyInNos} , #{reason} , #{identity} )")
	void  saveIssuereceiptitemseg(Issuereceiptitemseg issuereceiptitemseg);

	@Update ("UPDATE  issuereceiptitemseg SET QtyInNos = #{qtyInNos}, Reason = #{reason}, Identity = #{identity} WHERE IRId = #{iRId} AND SerialNo = #{serialNo} AND SegType = #{segType} AND Characteristics = #{characteristics} ")
	void  updateIssuereceiptitemseg(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo, @Param("segType") String segType, @Param("characteristics") String characteristics);

	@Delete ("DELETE FROM issuereceiptitemseg WHERE IRId = #{iRId} AND SerialNo = #{serialNo} AND SegType = #{segType} AND Characteristics = #{characteristics} ")
	void  deleteIssuereceiptitemseg(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo, @Param("segType") String segType, @Param("characteristics") String characteristics);

    void updateIssuereceiptitemseg(Issuereceiptitemseg issuereceiptitemseg);
}
