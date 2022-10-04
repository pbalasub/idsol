package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Revenuebudgetplan;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface RevenuebudgetplanMapper{

	@Select ("SELECT * FROM revenuebudgetplan")
	List<Revenuebudgetplan> getAllRevenuebudgetplan();

	@Select ("SELECT * FROM revenuebudgetplan WHERE RBPId = #{rBPId} ")
	Revenuebudgetplan getRevenuebudgetplan(@Param("rBPId") Integer rBPId);

	@Insert ("INSERT INTO revenuebudgetplan(RBPId, RBPNo, RBPDate, RBPName, FromYear, TillYear, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{rBPId} , #{rBPNo} , #{rBPDate} , #{rBPName} , #{fromYear} , #{tillYear} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveRevenuebudgetplan(Revenuebudgetplan revenuebudgetplan);

	@Update ("UPDATE  revenuebudgetplan SET RBPNo = #{rBPNo}, RBPDate = #{rBPDate}, RBPName = #{rBPName}, FromYear = #{fromYear}, TillYear = #{tillYear}, Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE RBPId = #{rBPId} ")
	void  updateRevenuebudgetplan(@Param("rBPId") Revenuebudgetplan rBPId);

	@Delete ("DELETE FROM revenuebudgetplan WHERE RBPId = #{rBPId} ")
	void  deleteRevenuebudgetplan(@Param("rBPId") Integer rBPId);

}
