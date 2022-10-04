package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Jobworkorderitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface JobworkorderitemMapper{

	@Select ("SELECT * FROM jobworkorderitem")
	List<Jobworkorderitem> getAllJobworkorderitem();

	@Select ("SELECT * FROM jobworkorderitem WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} ")
	Jobworkorderitem getJobworkorderitem(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO jobworkorderitem(JWOId, SerialNo, ProcessFrom, ProcessTo, ReqLatestDays, ReqLatestDate)  VALUES (#{jWOId} , #{serialNo} , #{processFrom} , #{processTo} , #{reqLatestDays} , #{reqLatestDate} )")
	void  saveJobworkorderitem(Jobworkorderitem jobworkorderitem);

	@Update ("UPDATE  jobworkorderitem SET ProcessFrom = #{processFrom}, ProcessTo = #{processTo}, ReqLatestDays = #{reqLatestDays}, ReqLatestDate = #{reqLatestDate} WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} ")
	void  updateJobworkorderitem(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM jobworkorderitem WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} ")
	void  deleteJobworkorderitem(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo);

    void updateJobworkorderitem(Jobworkorderitem jobworkorderitem);
}
