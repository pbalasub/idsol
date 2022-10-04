package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Mtcecharplandetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MtcecharplandetailsMapper{

	@Select ("SELECT * FROM mtcecharplandetails")
	List<Mtcecharplandetails> getAllMtcecharplandetails();

	@Select ("SELECT * FROM mtcecharplandetails WHERE CPId = #{cPId} AND SerialNo = #{serialNo} ")
	Mtcecharplandetails getMtcecharplandetails(@Param("cPId") Integer cPId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO mtcecharplandetails(CPId, SerialNo, Characteristics, PlanType, SpecialChar, EvalTech, Daily, Weekly, Monthly, Quarterly, HalfYearly, Annually)  VALUES (#{cPId} , #{serialNo} , #{characteristics} , #{planType} , #{specialChar} , #{evalTech} , #{daily} , #{weekly} , #{monthly} , #{quarterly} , #{halfYearly} , #{annually} )")
	void  saveMtcecharplandetails(Mtcecharplandetails mtcecharplandetails);

	@Update ("UPDATE  mtcecharplandetails SET Characteristics = #{characteristics}, PlanType = #{planType}, SpecialChar = #{specialChar}, EvalTech = #{evalTech}, Daily = #{daily}, Weekly = #{weekly}, Monthly = #{monthly}, Quarterly = #{quarterly}, HalfYearly = #{halfYearly}, Annually = #{annually} WHERE CPId = #{cPId} AND SerialNo = #{serialNo} ")
	void  updateMtcecharplandetails(@Param("cPId") Integer cPId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM mtcecharplandetails WHERE CPId = #{cPId} AND SerialNo = #{serialNo} ")
	void  deleteMtcecharplandetails(@Param("cPId") Integer cPId, @Param("serialNo") Integer serialNo);

    void updateMtcecharplandetails(Mtcecharplandetails mtcecharplandetails);
}
