package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Cashvoucher;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CashvoucherMapper{

	@Select ("SELECT * FROM cashvoucher")
	List<Cashvoucher> getAllCashvoucher();

	@Select ("SELECT * FROM cashvoucher WHERE CVId = #{cVId} ")
	Cashvoucher getCashvoucher(@Param("cVId") Integer cVId);

	@Insert ("INSERT INTO cashvoucher(CVId, CVNo, CVType, CVDate, CVDueTo, EmpCode, SupplierCode, SupplierRepName, AmountRequested, AmountGranted, Reason, AmountPaid, ReceiptAmount, VoucherStatus, Remarks, TotalAmount, TotalAmountInWords, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, ChequeNo, ChequeDate, ChequeAmount, ChequeAmountInWords, BankName, BranchName, BankAccountNo)  VALUES (#{cVId} , #{cVNo} , #{cVType} , #{cVDate} , #{cVDueTo} , #{empCode} , #{supplierCode} , #{supplierRepName} , #{amountRequested} , #{amountGranted} , #{reason} , #{amountPaid} , #{receiptAmount} , #{voucherStatus} , #{remarks} , #{totalAmount} , #{totalAmountInWords} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{chequeNo} , #{chequeDate} , #{chequeAmount} , #{chequeAmountInWords} , #{bankName} , #{branchName} , #{bankAccountNo} )")
	void  saveCashvoucher(Cashvoucher cashvoucher);

	@Update ("UPDATE  cashvoucher SET CVNo = #{cVNo}, CVType = #{cVType}, CVDate = #{cVDate}, CVDueTo = #{cVDueTo}, EmpCode = #{empCode}, SupplierCode = #{supplierCode}, SupplierRepName = #{supplierRepName}, AmountRequested = #{amountRequested}, AmountGranted = #{amountGranted}, Reason = #{reason}, AmountPaid = #{amountPaid}, ReceiptAmount = #{receiptAmount}, VoucherStatus = #{voucherStatus}, Remarks = #{remarks}, TotalAmount = #{totalAmount}, TotalAmountInWords = #{totalAmountInWords}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, ChequeNo = #{chequeNo}, ChequeDate = #{chequeDate}, ChequeAmount = #{chequeAmount}, ChequeAmountInWords = #{chequeAmountInWords}, BankName = #{bankName}, BranchName = #{branchName}, BankAccountNo = #{bankAccountNo} WHERE CVId = #{cVId} ")
	void  updateCashvoucher(@Param("cVId") Integer cVId);

	@Delete ("DELETE FROM cashvoucher WHERE CVId = #{cVId} ")
	void  deleteCashvoucher(@Param("cVId") Integer cVId);

}
