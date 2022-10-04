package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Continualimprovement;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ContinualimprovementMapper{

	@Select ("SELECT * FROM continualimprovement")
	List<Continualimprovement> getAllContinualimprovement();

	@Select ("SELECT * FROM continualimprovement WHERE CINo = #{cINo} ")
	Continualimprovement getContinualimprovement(@Param("cINo") String cINo);

	@Insert ("INSERT INTO continualimprovement(CINo, CIDate, ProjectTitle, ProjectDesc, TargetDate, Remarks, ResponsibleTeam, ActionRemarks, StartDate, EndDate, ImprovementStatus, MetricsDetails, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime)  VALUES (#{cINo} , #{cIDate} , #{projectTitle} , #{projectDesc} , #{targetDate} , #{remarks} , #{responsibleTeam} , #{actionRemarks} , #{startDate} , #{endDate} , #{improvementStatus} , #{metricsDetails} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} )")
	void  saveContinualimprovement(Continualimprovement continualimprovement);

	@Update ("UPDATE  continualimprovement SET CIDate = #{cIDate}, ProjectTitle = #{projectTitle}, ProjectDesc = #{projectDesc}, TargetDate = #{targetDate}, Remarks = #{remarks}, ResponsibleTeam = #{responsibleTeam}, ActionRemarks = #{actionRemarks}, StartDate = #{startDate}, EndDate = #{endDate}, ImprovementStatus = #{improvementStatus}, MetricsDetails = #{metricsDetails}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime} WHERE CINo = #{cINo} ")
	void  updateContinualimprovement(@Param("cINo") String cINo);

	@Delete ("DELETE FROM continualimprovement WHERE CINo = #{cINo} ")
	void  deleteContinualimprovement(@Param("cINo") String cINo);

}
