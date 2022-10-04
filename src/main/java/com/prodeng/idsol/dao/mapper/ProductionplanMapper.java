package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Productionplan;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ProductionplanMapper{

	@Select ("SELECT * FROM productionplan")
	List<Productionplan> getAllProductionplan();

	@Select ("SELECT * FROM productionplan WHERE PPId = #{pPId} ")
	Productionplan getProductionplan(@Param("pPId") Integer pPId);

	@Insert ("INSERT INTO productionplan(PPId, PPNo, PPName, PPDate, Process, PPFromDate, PPTillDate, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{pPId} , #{pPNo} , #{pPName} , #{pPDate} , #{process} , #{pPFromDate} , #{pPTillDate} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveProductionplan(Productionplan productionplan);

	@Update ("UPDATE  productionplan SET PPNo = #{pPNo}, PPName = #{pPName}, PPDate = #{pPDate}, Process = #{process}, PPFromDate = #{pPFromDate}, PPTillDate = #{pPTillDate}, Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE PPId = #{pPId} ")
	void  updateProductionplan(@Param("pPId") Integer pPId);

	@Delete ("DELETE FROM productionplan WHERE PPId = #{pPId} ")
	void  deleteProductionplan(@Param("pPId") Integer pPId);

}
