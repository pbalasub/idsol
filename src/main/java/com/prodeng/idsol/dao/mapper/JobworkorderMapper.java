package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Jobworkorder;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface JobworkorderMapper{

	@Select ("SELECT * FROM jobworkorder")
	List<Jobworkorder> getAllJobworkorder();

	@Select ("SELECT * FROM jobworkorder WHERE JWOId = #{jWOId} ")
	Jobworkorder getJobworkorder(@Param("jWOId") Integer jWOId);

	@Insert ("INSERT INTO jobworkorder(JWOId, JWONo, JWRNo, JWODate, dept, SupplierCode, PackageForward, Freight, Insurance, Others, BasicED, VAT, Guarantee, PaymentTerms, DeliveryAt, TotalJWO, Advance, ToBePaid, ServiceTax, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime, DisbursedAmt)  VALUES (#{jWOId} , #{jWONo} , #{jWRNo} , #{jWODate} , #{dept} , #{supplierCode} , #{packageForward} , #{freight} , #{insurance} , #{others} , #{basicED} , #{vAT} , #{guarantee} , #{paymentTerms} , #{deliveryAt} , #{totalJWO} , #{advance} , #{toBePaid} , #{serviceTax} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} , #{disbursedAmt} )")
	void  saveJobworkorder(Jobworkorder jobworkorder);

	@Update ("UPDATE  jobworkorder SET JWONo = #{jWONo}, JWRNo = #{jWRNo}, JWODate = #{jWODate}, dept = #{dept}, SupplierCode = #{supplierCode}, PackageForward = #{packageForward}, Freight = #{freight}, Insurance = #{insurance}, Others = #{others}, BasicED = #{basicED}, VAT = #{vAT}, Guarantee = #{guarantee}, PaymentTerms = #{paymentTerms}, DeliveryAt = #{deliveryAt}, TotalJWO = #{totalJWO}, Advance = #{advance}, ToBePaid = #{toBePaid}, ServiceTax = #{serviceTax}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime}, DisbursedAmt = #{disbursedAmt} WHERE JWOId = #{jWOId} ")
	void  updateJobworkorder(@Param("jWOId") Integer jWOId);

	@Delete ("DELETE FROM jobworkorder WHERE JWOId = #{jWOId} ")
	void  deleteJobworkorder(@Param("jWOId") Integer jWOId);

}
