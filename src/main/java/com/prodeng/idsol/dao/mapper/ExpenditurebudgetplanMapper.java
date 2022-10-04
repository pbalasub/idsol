package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Expenditurebudgetplan;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ExpenditurebudgetplanMapper{

	@Select ("SELECT * FROM expenditurebudgetplan")
	List<Expenditurebudgetplan> getAllExpenditurebudgetplan();

	@Select ("SELECT * FROM expenditurebudgetplan WHERE EBPId = #{eBPId} ")
	Expenditurebudgetplan getExpenditurebudgetplan(@Param("eBPId") Integer eBPId);

	@Insert ("INSERT INTO expenditurebudgetplan(EBPId, EBPNo, EBPDate, EBPName, FromYear, TillYear, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{eBPId} , #{eBPNo} , #{eBPDate} , #{eBPName} , #{fromYear} , #{tillYear} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveExpenditurebudgetplan(Expenditurebudgetplan expenditurebudgetplan);

	@Update ("UPDATE  expenditurebudgetplan SET EBPNo = #{eBPNo}, EBPDate = #{eBPDate}, EBPName = #{eBPName}, FromYear = #{fromYear}, TillYear = #{tillYear}, Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE EBPId = #{eBPId} ")
	void  updateExpenditurebudgetplan(@Param("eBPId") Expenditurebudgetplan eBPId);

	@Delete ("DELETE FROM expenditurebudgetplan WHERE EBPId = #{eBPId} ")
	void  deleteExpenditurebudgetplan(@Param("eBPId") Integer eBPId);

}
