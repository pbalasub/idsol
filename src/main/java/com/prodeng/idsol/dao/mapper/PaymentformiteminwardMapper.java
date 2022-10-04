package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Paymentformiteminward;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PaymentformiteminwardMapper{

	@Select ("SELECT * FROM paymentformiteminward")
	List<Paymentformiteminward> getAllPaymentformiteminward();

	@Select ("SELECT * FROM paymentformiteminward WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} AND InwardId = #{inwardId} AND InwardSerialNo = #{inwardSerialNo} ")
	Paymentformiteminward getPaymentformiteminward(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo, @Param("inwardId") Integer inwardId, @Param("inwardSerialNo") Integer inwardSerialNo);

	@Insert ("INSERT INTO paymentformiteminward(PaymentId, SerialNo, InwardId, InwardSerialNo, InwardNo, ItemCode)  VALUES (#{paymentId} , #{serialNo} , #{inwardId} , #{inwardSerialNo} , #{inwardNo} , #{itemCode} )")
	void  savePaymentformiteminward(Paymentformiteminward paymentformiteminward);

	@Update ("UPDATE  paymentformiteminward SET InwardNo = #{inwardNo}, ItemCode = #{itemCode} WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} AND InwardId = #{inwardId} AND InwardSerialNo = #{inwardSerialNo} ")
	void  updatePaymentformiteminward(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo, @Param("inwardId") Integer inwardId, @Param("inwardSerialNo") Integer inwardSerialNo);

	@Delete ("DELETE FROM paymentformiteminward WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} AND InwardId = #{inwardId} AND InwardSerialNo = #{inwardSerialNo} ")
	void  deletePaymentformiteminward(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo, @Param("inwardId") Integer inwardId, @Param("inwardSerialNo") Integer inwardSerialNo);

    void updatePaymentformiteminward(Paymentformiteminward paymentformiteminward);
}
