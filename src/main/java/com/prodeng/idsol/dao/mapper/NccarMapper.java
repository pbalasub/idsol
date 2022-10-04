package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Nccar;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface NccarMapper{

	@Select ("SELECT * FROM nccar")
	List<Nccar> getAllNccar();

	@Select ("SELECT * FROM nccar WHERE NCCARNo = #{nCCARNo} ")
	Nccar getNccar(@Param("nCCARNo") String nCCARNo);

	@Insert ("INSERT INTO nccar(NCCARNo, NCCARDate, NCCARType, RefNo, SuppSecCode, ItemCode, ProblemStatus, DeviationObserved, RootCause, CorrectiveAction, PreventiveAction, TargetDate, VerifiedDate, VerifiedDetails, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, SupplierDCNo, Result, ReportDetail)  VALUES (#{nCCARNo} , #{nCCARDate} , #{nCCARType} , #{refNo} , #{suppSecCode} , #{itemCode} , #{problemStatus} , #{deviationObserved} , #{rootCause} , #{correctiveAction} , #{preventiveAction} , #{targetDate} , #{verifiedDate} , #{verifiedDetails} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{supplierDCNo} , #{result} , #{reportDetail} )")
	void  saveNccar(Nccar nccar);

	@Update ("UPDATE  nccar SET NCCARDate = #{nCCARDate}, NCCARType = #{nCCARType}, RefNo = #{refNo}, SuppSecCode = #{suppSecCode}, ItemCode = #{itemCode}, ProblemStatus = #{problemStatus}, DeviationObserved = #{deviationObserved}, RootCause = #{rootCause}, CorrectiveAction = #{correctiveAction}, PreventiveAction = #{preventiveAction}, TargetDate = #{targetDate}, VerifiedDate = #{verifiedDate}, VerifiedDetails = #{verifiedDetails}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, SupplierDCNo = #{supplierDCNo}, Result = #{result}, ReportDetail = #{reportDetail} WHERE NCCARNo = #{nCCARNo} ")
	void  updateNccar(@Param("nCCARNo") String nCCARNo);

	@Delete ("DELETE FROM nccar WHERE NCCARNo = #{nCCARNo} ")
	void  deleteNccar(@Param("nCCARNo") String nCCARNo);

}
