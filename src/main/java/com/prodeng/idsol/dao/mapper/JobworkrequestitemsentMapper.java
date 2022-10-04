package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Jobworkrequestitemsent;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface JobworkrequestitemsentMapper{

	@Select ("SELECT * FROM jobworkrequestitemsent")
	List<Jobworkrequestitemsent> getAllJobworkrequestitemsent();

	@Select ("SELECT * FROM jobworkrequestitemsent WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} AND ItemCodeSent = #{itemCodeSent} ")
	Jobworkrequestitemsent getJobworkrequestitemsent(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo, @Param("itemCodeSent") String itemCodeSent);

	@Insert ("INSERT INTO jobworkrequestitemsent(JWRId, SerialNo, ItemCodeSent, JWRQtySent)  VALUES (#{jWRId} , #{serialNo} , #{itemCodeSent} , #{jWRQtySent} )")
	void  saveJobworkrequestitemsent(Jobworkrequestitemsent jobworkrequestitemsent);

	@Update ("UPDATE  jobworkrequestitemsent SET JWRQtySent = #{jWRQtySent} WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} AND ItemCodeSent = #{itemCodeSent} ")
	void  updateJobworkrequestitemsent(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo, @Param("itemCodeSent") String itemCodeSent);

	@Delete ("DELETE FROM jobworkrequestitemsent WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} AND ItemCodeSent = #{itemCodeSent} ")
	void  deleteJobworkrequestitemsent(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo, @Param("itemCodeSent") String itemCodeSent);

    void updateJobworkrequestitemsent(Jobworkrequestitemsent jobworkrequestitemsent);
}
