package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Jobworkorderitemsent;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface JobworkorderitemsentMapper{

	@Select ("SELECT * FROM jobworkorderitemsent")
	List<Jobworkorderitemsent> getAllJobworkorderitemsent();

	@Select ("SELECT * FROM jobworkorderitemsent WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} AND ItemCodeSent = #{itemCodeSent} ")
	Jobworkorderitemsent getJobworkorderitemsent(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo, @Param("itemCodeSent") String itemCodeSent);

	@Insert ("INSERT INTO jobworkorderitemsent(JWOId, SerialNo, ItemCodeSent, JWOQtySent, UOM)  VALUES (#{jWOId} , #{serialNo} , #{itemCodeSent} , #{jWOQtySent} , #{uOM} )")
	void  saveJobworkorderitemsent(Jobworkorderitemsent jobworkorderitemsent);

	@Update ("UPDATE  jobworkorderitemsent SET JWOQtySent = #{jWOQtySent}, UOM = #{uOM} WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} AND ItemCodeSent = #{itemCodeSent} ")
	void  updateJobworkorderitemsent(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo, @Param("itemCodeSent") String itemCodeSent);

	@Delete ("DELETE FROM jobworkorderitemsent WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} AND ItemCodeSent = #{itemCodeSent} ")
	void  deleteJobworkorderitemsent(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo, @Param("itemCodeSent") String itemCodeSent);

    void updateJobworkorderitemsent(Jobworkorderitemsent jobworkorderitemsent);
}
