package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Paymentformrequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PaymentformrequestMapper{

	@Select ("SELECT * FROM paymentformrequest")
	List<Paymentformrequest> getAllPaymentformrequest();

	@Select ("SELECT * FROM paymentformrequest WHERE PaymentId = #{paymentId} ")
	Paymentformrequest getPaymentformrequest(@Param("paymentId") Integer paymentId);

	@Insert ("INSERT INTO paymentformrequest(PaymentId, PaymentNo, PaymentFor, Dept, SupplierCode, InFavourOf, ReqLatestDate, Remarks, ChequeNo, ChequeDate, ChequeAmount, ChequeAmtInWrds, BankName, PaymentTotalAmount, PaymentTotalAmtInWrds, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, StageFiveName, StageFiveDate, StageFiveTime, StageSixName, StageSixDate, StageSixTime, PaymentReqDate, BranchName, BankAccountNo)  VALUES (#{paymentId} , #{paymentNo} , #{paymentFor} , #{dept} , #{supplierCode} , #{inFavourOf} , #{reqLatestDate} , #{remarks} , #{chequeNo} , #{chequeDate} , #{chequeAmount} , #{chequeAmtInWrds} , #{bankName} , #{paymentTotalAmount} , #{paymentTotalAmtInWrds} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{stageFiveName} , #{stageFiveDate} , #{stageFiveTime} , #{stageSixName} , #{stageSixDate} , #{stageSixTime} , #{paymentReqDate} , #{branchName} , #{bankAccountNo} )")
	void  savePaymentformrequest(Paymentformrequest paymentformrequest);

	@Update ("UPDATE  paymentformrequest SET PaymentNo = #{paymentNo}, PaymentFor = #{paymentFor}, Dept = #{dept}, SupplierCode = #{supplierCode}, InFavourOf = #{inFavourOf}, ReqLatestDate = #{reqLatestDate}, Remarks = #{remarks}, ChequeNo = #{chequeNo}, ChequeDate = #{chequeDate}, ChequeAmount = #{chequeAmount}, ChequeAmtInWrds = #{chequeAmtInWrds}, BankName = #{bankName}, PaymentTotalAmount = #{paymentTotalAmount}, PaymentTotalAmtInWrds = #{paymentTotalAmtInWrds}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, StageFiveName = #{stageFiveName}, StageFiveDate = #{stageFiveDate}, StageFiveTime = #{stageFiveTime}, StageSixName = #{stageSixName}, StageSixDate = #{stageSixDate}, StageSixTime = #{stageSixTime}, PaymentReqDate = #{paymentReqDate}, BranchName = #{branchName}, BankAccountNo = #{bankAccountNo} WHERE PaymentId = #{paymentId} ")
	void  updatePaymentformrequest(@Param("paymentId") Integer paymentId);

	@Delete ("DELETE FROM paymentformrequest WHERE PaymentId = #{paymentId} ")
	void  deletePaymentformrequest(@Param("paymentId") Integer paymentId);

}
