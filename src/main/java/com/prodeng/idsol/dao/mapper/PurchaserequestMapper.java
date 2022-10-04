package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Purchaserequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PurchaserequestMapper{

	@Select ("SELECT * FROM purchaserequest")
	List<Purchaserequest> getAllPurchaserequest();

	@Select ("SELECT * FROM purchaserequest WHERE PRId = #{pRId} ")
	Purchaserequest getPurchaserequest(@Param("pRId") Integer pRId);

	@Insert ("INSERT INTO purchaserequest(PRId, PRNo, PRDate, dept, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, StageFiveName, StageFiveDate, StageFiveTime, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime)  VALUES (#{pRId} , #{pRNo} , #{pRDate} , #{dept} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{stageFiveName} , #{stageFiveDate} , #{stageFiveTime} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} )")
	void  savePurchaserequest(Purchaserequest purchaserequest);

	@Update ("UPDATE  purchaserequest SET PRNo = #{pRNo}, PRDate = #{pRDate}, dept = #{dept}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, StageFiveName = #{stageFiveName}, StageFiveDate = #{stageFiveDate}, StageFiveTime = #{stageFiveTime}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime} WHERE PRId = #{pRId} ")
	void  updatePurchaserequest(@Param("pRId") Integer pRId);

	@Delete ("DELETE FROM purchaserequest WHERE PRId = #{pRId} ")
	void  deletePurchaserequest(@Param("pRId") Integer pRId);

}
