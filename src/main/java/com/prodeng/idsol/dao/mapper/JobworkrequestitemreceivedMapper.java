package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Jobworkrequestitemreceived;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface JobworkrequestitemreceivedMapper{

	@Select ("SELECT * FROM jobworkrequestitemreceived")
	List<Jobworkrequestitemreceived> getAllJobworkrequestitemreceived();

	@Select ("SELECT * FROM jobworkrequestitemreceived WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} AND ItemCodeReceived = #{itemCodeReceived} ")
	Jobworkrequestitemreceived getJobworkrequestitemreceived(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo, @Param("itemCodeReceived") String itemCodeReceived);

	@Insert ("INSERT INTO jobworkrequestitemreceived(JWRId, SerialNo, ItemCodeReceived, JWRQtyReceived, SupplierCode)  VALUES (#{jWRId} , #{serialNo} , #{itemCodeReceived} , #{jWRQtyReceived} , #{supplierCode} )")
	void  saveJobworkrequestitemreceived(Jobworkrequestitemreceived jobworkrequestitemreceived);

	@Update ("UPDATE  jobworkrequestitemreceived SET JWRQtyReceived = #{jWRQtyReceived}, SupplierCode = #{supplierCode} WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} AND ItemCodeReceived = #{itemCodeReceived} ")
	void  updateJobworkrequestitemreceived(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo, @Param("itemCodeReceived") String itemCodeReceived);

	@Delete ("DELETE FROM jobworkrequestitemreceived WHERE JWRId = #{jWRId} AND SerialNo = #{serialNo} AND ItemCodeReceived = #{itemCodeReceived} ")
	void  deleteJobworkrequestitemreceived(@Param("jWRId") Integer jWRId, @Param("serialNo") Integer serialNo, @Param("itemCodeReceived") String itemCodeReceived);

    void updateJobworkrequestitemreceived(Jobworkrequestitemreceived jobworkrequestitemreceived);
}
