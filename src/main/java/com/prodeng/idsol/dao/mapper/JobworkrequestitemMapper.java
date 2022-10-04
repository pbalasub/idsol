package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Jobworkrequestitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface JobworkrequestitemMapper{

	@Select ("SELECT * FROM jobworkrequestitem")
	List<Jobworkrequestitem> getAllJobworkrequestitem();

	@Select ("SELECT * FROM jobworkrequestitem WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} ")
	Jobworkrequestitem getJobworkrequestitem(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO jobworkrequestitem(JWRId, SerialNo, ProcessFrom, ProcessTo, ReqLatestDays, ReqLatestDate, Purpose, RejReason)  VALUES (#{jWRId} , #{serialNo} , #{processFrom} , #{processTo} , #{reqLatestDays} , #{reqLatestDate} , #{purpose} , #{rejReason} )")
	void  saveJobworkrequestitem(Jobworkrequestitem jobworkrequestitem);

	@Update ("UPDATE  jobworkrequestitem SET ProcessFrom = #{processFrom}, ProcessTo = #{processTo}, ReqLatestDays = #{reqLatestDays}, ReqLatestDate = #{reqLatestDate}, Purpose = #{purpose}, RejReason = #{rejReason} WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} ")
	void  updateJobworkrequestitem(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM jobworkrequestitem WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} ")
	void  deleteJobworkrequestitem(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo);

    void updateJobworkrequestitem(Jobworkrequestitem jobworkrequestitem);
}
