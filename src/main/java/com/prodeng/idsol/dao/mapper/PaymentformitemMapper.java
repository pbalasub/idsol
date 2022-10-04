package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Paymentformitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PaymentformitemMapper{

	@Select ("SELECT * FROM paymentformitem")
	List<Paymentformitem> getAllPaymentformitem();

	@Select ("SELECT * FROM paymentformitem WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} ")
	Paymentformitem getPaymentformitem(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO paymentformitem(PaymentId, SerialNo, OrderType, OrderNo, OrderAmount, OrderAdvance, OrderToBePaid, SupplierBillNo, SupplierBillDate, SupplierBillAmt, PackageForward, ExciseDuty, EducationCess, SecHighEduCess, VAT, ServiceTax, Insurance, Freight, DiffAmt, DiffAmtReason, RecommendedAmt, AccHeadCode)  VALUES (#{paymentId} , #{serialNo} , #{orderType} , #{orderNo} , #{orderAmount} , #{orderAdvance} , #{orderToBePaid} , #{supplierBillNo} , #{supplierBillDate} , #{supplierBillAmt} , #{packageForward} , #{exciseDuty} , #{educationCess} , #{secHighEduCess} , #{vAT} , #{serviceTax} , #{insurance} , #{freight} , #{diffAmt} , #{diffAmtReason} , #{recommendedAmt} , #{accHeadCode} )")
	void  savePaymentformitem(Paymentformitem paymentformitem);

	@Update ("UPDATE  paymentformitem SET OrderType = #{orderType}, OrderNo = #{orderNo}, OrderAmount = #{orderAmount}, OrderAdvance = #{orderAdvance}, OrderToBePaid = #{orderToBePaid}, SupplierBillNo = #{supplierBillNo}, SupplierBillDate = #{supplierBillDate}, SupplierBillAmt = #{supplierBillAmt}, PackageForward = #{packageForward}, ExciseDuty = #{exciseDuty}, EducationCess = #{educationCess}, SecHighEduCess = #{secHighEduCess}, VAT = #{vAT}, ServiceTax = #{serviceTax}, Insurance = #{insurance}, Freight = #{freight}, DiffAmt = #{diffAmt}, DiffAmtReason = #{diffAmtReason}, RecommendedAmt = #{recommendedAmt}, AccHeadCode = #{accHeadCode} WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} ")
	void  updatePaymentformitem(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM paymentformitem WHERE PaymentId = #{paymentId} AND SerialNo = #{serialNo} ")
	void  deletePaymentformitem(@Param("paymentId") Integer paymentId, @Param("serialNo") Integer serialNo);

    void updatePaymentformitem(Paymentformitem paymentformitem);
}
