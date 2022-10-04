package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Mtcecharplan;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MtcecharplanMapper{

	@Select ("SELECT * FROM mtcecharplan")
	List<Mtcecharplan> getAllMtcecharplan();

	@Select ("SELECT * FROM mtcecharplan WHERE CPId = #{cPId} ")
	Mtcecharplan getMtcecharplan(@Param("cPId") Integer cPId);

	@Insert ("INSERT INTO mtcecharplan(CPId, CPNo, CPDate, Revision, CPStatus, HistoryCode, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{cPId} , #{cPNo} , #{cPDate} , #{revision} , #{cPStatus} , #{historyCode} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveMtcecharplan(Mtcecharplan mtcecharplan);

	@Update ("UPDATE  mtcecharplan SET CPNo = #{cPNo}, CPDate = #{cPDate}, Revision = #{revision}, CPStatus = #{cPStatus}, HistoryCode = #{historyCode}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE CPId = #{cPId} ")
	void  updateMtcecharplan(@Param("cPId") Integer cPId);

	@Delete ("DELETE FROM mtcecharplan WHERE CPId = #{cPId} ")
	void  deleteMtcecharplan(@Param("cPId") Integer cPId);

}
