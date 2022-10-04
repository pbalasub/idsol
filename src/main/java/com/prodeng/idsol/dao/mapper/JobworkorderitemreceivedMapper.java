package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Jobworkorderitemreceived;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface JobworkorderitemreceivedMapper{

	@Select ("SELECT * FROM jobworkorderitemreceived")
	List<Jobworkorderitemreceived> getAllJobworkorderitemreceived();

	@Select ("SELECT * FROM jobworkorderitemreceived WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} AND ItemCodeReceived = #{itemCodeReceived} ")
	Jobworkorderitemreceived getJobworkorderitemreceived(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo, @Param("itemCodeReceived") String itemCodeReceived);

	@Insert ("INSERT INTO jobworkorderitemreceived(JWOId, SerialNo, ItemCodeReceived, JWOQtyReceived, ItemRate, Discount, CashDisc, TotalRate, AlternateUOM, ConvFactor, UnitPrice, PackageForward, Insurance, ExciseDuty, VAT, ServiceTax)  VALUES (#{jWOId} , #{serialNo} , #{itemCodeReceived} , #{jWOQtyReceived} , #{itemRate} , #{discount} , #{cashDisc} , #{totalRate} , #{alternateUOM} , #{convFactor} , #{unitPrice} , #{packageForward} , #{insurance} , #{exciseDuty} , #{vAT} , #{serviceTax} )")
	void  saveJobworkorderitemreceived(Jobworkorderitemreceived jobworkorderitemreceived);

	@Update ("UPDATE  jobworkorderitemreceived SET JWOQtyReceived = #{jWOQtyReceived}, ItemRate = #{itemRate}, Discount = #{discount}, CashDisc = #{cashDisc}, TotalRate = #{totalRate}, AlternateUOM = #{alternateUOM}, ConvFactor = #{convFactor}, UnitPrice = #{unitPrice}, PackageForward = #{packageForward}, Insurance = #{insurance}, ExciseDuty = #{exciseDuty}, VAT = #{vAT}, ServiceTax = #{serviceTax} WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} AND ItemCodeReceived = #{itemCodeReceived} ")
	void  updateJobworkorderitemreceived(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo, @Param("itemCodeReceived") String itemCodeReceived);

	@Delete ("DELETE FROM jobworkorderitemreceived WHERE JWOId = #{jWOId} AND SerialNo = #{serialNo} AND ItemCodeReceived = #{itemCodeReceived} ")
	void  deleteJobworkorderitemreceived(@Param("jWOId") Integer jWOId, @Param("serialNo") Integer serialNo, @Param("itemCodeReceived") String itemCodeReceived);

    void updateJobworkorderitemreceived(Jobworkorderitemreceived jobworkorderitemreceived);
}
