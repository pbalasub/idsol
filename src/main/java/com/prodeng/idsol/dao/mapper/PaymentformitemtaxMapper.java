package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Paymentformitemtax;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PaymentformitemtaxMapper{

	@Select ("SELECT * FROM paymentformitemtax")
	List<Paymentformitemtax> getAllPaymentformitemtax();

	@Select ("SELECT * FROM paymentformitemtax WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} AND TaxCode = #{taxCode} ")
	Paymentformitemtax getPaymentformitemtax(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo, @Param("taxCode") String taxCode);

	@Insert ("INSERT INTO paymentformitemtax(PaymentId, SerialNo, TaxCode, TaxValue)  VALUES (#{paymentId} , #{serialNo} , #{taxCode} , #{taxValue} )")
	void  savePaymentformitemtax(Paymentformitemtax paymentformitemtax);

	@Update ("UPDATE  paymentformitemtax SET TaxValue = #{taxValue} WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} AND TaxCode = #{taxCode} ")
	void  updatePaymentformitemtax(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo, @Param("taxCode") String taxCode);

	@Delete ("DELETE FROM paymentformitemtax WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} AND TaxCode = #{taxCode} ")
	void  deletePaymentformitemtax(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo, @Param("taxCode") String taxCode);

    void updatePaymentformitemtax(Paymentformitemtax paymentformitemtax);
}
