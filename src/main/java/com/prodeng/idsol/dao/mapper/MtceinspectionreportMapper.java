package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Mtceinspectionreport;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MtceinspectionreportMapper{

	@Select ("SELECT * FROM mtceinspectionreport")
	List<Mtceinspectionreport> getAllMtceinspectionreport();

	@Select ("SELECT * FROM mtceinspectionreport WHERE IRId = #{iRId} ")
	Mtceinspectionreport getMtceinspectionreport(@Param("iRId") Integer iRId);

	@Insert ("INSERT INTO mtceinspectionreport(IRId, IRNo, IRDate, MPNo, HistoryCode, PlanType, Frequency, PlannedOn, ActionTakenOn, CPNo, CPUpdatedBy, CPUpdatedDate, CPUpdatedTime, InspectedBy1, InspectedBy2, Recommendation, ReviewedBy, ReviewedComments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime)  VALUES (#{iRId} , #{iRNo} , #{iRDate} , #{mPNo} , #{historyCode} , #{planType} , #{frequency} , #{plannedOn} , #{actionTakenOn} , #{cPNo} , #{cPUpdatedBy} , #{cPUpdatedDate} , #{cPUpdatedTime} , #{inspectedBy1} , #{inspectedBy2} , #{recommendation} , #{reviewedBy} , #{reviewedComments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} )")
	void  saveMtceinspectionreport(Mtceinspectionreport mtceinspectionreport);

	@Update ("UPDATE  mtceinspectionreport SET IRNo = #{iRNo}, IRDate = #{iRDate}, MPNo = #{mPNo}, HistoryCode = #{historyCode}, PlanType = #{planType}, Frequency = #{frequency}, PlannedOn = #{plannedOn}, ActionTakenOn = #{actionTakenOn}, CPNo = #{cPNo}, CPUpdatedBy = #{cPUpdatedBy}, CPUpdatedDate = #{cPUpdatedDate}, CPUpdatedTime = #{cPUpdatedTime}, InspectedBy1 = #{inspectedBy1}, InspectedBy2 = #{inspectedBy2}, Recommendation = #{recommendation}, ReviewedBy = #{reviewedBy}, ReviewedComments = #{reviewedComments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime} WHERE IRId = #{iRId} ")
	void  updateMtceinspectionreport(@Param("iRId") Integer iRId);

	@Delete ("DELETE FROM mtceinspectionreport WHERE IRId = #{iRId} ")
	void  deleteMtceinspectionreport(@Param("iRId") Integer iRId);

}
