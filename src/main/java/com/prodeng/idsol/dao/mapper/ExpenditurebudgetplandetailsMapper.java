package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Expenditurebudgetplandetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ExpenditurebudgetplandetailsMapper{

	@Select ("SELECT * FROM expenditurebudgetplandetails")
	List<Expenditurebudgetplandetails> getAllExpenditurebudgetplandetails();

	@Select ("SELECT * FROM expenditurebudgetplandetails WHERE EBPId = #{eBPId} AND AccHeadCode = #{accHeadCode} ")
	Expenditurebudgetplandetails getExpenditurebudgetplandetails(@Param("eBPId") Integer eBPId, @Param("accHeadCode") String accHeadCode);

	@Insert ("INSERT INTO expenditurebudgetplandetails(EBPId, AccHeadCode, Remarks, AprAmount, MayAmount, JunAmount, JulAmount, AugAmount, SepAmount, OctAmount, NovAmount, DecAmount, JanAmount, FebAmount, MarAmount)  VALUES (#{eBPId} , #{accHeadCode} , #{remarks} , #{aprAmount} , #{mayAmount} , #{junAmount} , #{julAmount} , #{augAmount} , #{sepAmount} , #{octAmount} , #{novAmount} , #{decAmount} , #{janAmount} , #{febAmount} , #{marAmount} )")
	void  saveExpenditurebudgetplandetails(Expenditurebudgetplandetails expenditurebudgetplandetails);

	@Update ("UPDATE  expenditurebudgetplandetails SET Remarks = #{remarks}, AprAmount = #{aprAmount}, MayAmount = #{mayAmount}, JunAmount = #{junAmount}, JulAmount = #{julAmount}, AugAmount = #{augAmount}, SepAmount = #{sepAmount}, OctAmount = #{octAmount}, NovAmount = #{novAmount}, DecAmount = #{decAmount}, JanAmount = #{janAmount}, FebAmount = #{febAmount}, MarAmount = #{marAmount} WHERE EBPId = #{eBPId} AND AccHeadCode = #{accHeadCode} ")
	void  updateExpenditurebudgetplandetails(@Param("eBPId") Integer eBPId, @Param("accHeadCode") String accHeadCode);

	@Delete ("DELETE FROM expenditurebudgetplandetails WHERE EBPId = #{eBPId} AND AccHeadCode = #{accHeadCode} ")
	void  deleteExpenditurebudgetplandetails(@Param("eBPId") Integer eBPId, @Param("accHeadCode") String accHeadCode);

    void updateExpenditurebudgetplandetails(Expenditurebudgetplandetails expenditurebudgetplandetails);
}
