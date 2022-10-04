package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Controlplan;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ControlplanMapper{

	@Select ("SELECT * FROM controlplan")
	List<Controlplan> getAllControlplan();

	@Select ("SELECT * FROM controlplan WHERE CPId = #{cPId} ")
	Controlplan getControlplan(@Param("cPId") Integer cPId);

	@Insert ("INSERT INTO controlplan(CPId, CPNo, CPDate, CPFor, Process, ItemCode, DrawingName, RevisionNo, RevisionDate, CPStatus, CustEngAppr, CustEngApprDate, CustQualAppr, CustQualApprDate, CustOtherAppr, CustOtherApprDate, PlantAppr, PlantApprDate, SuppAppr, SuppApprDate, SuppOtherAppr, SuppOtherApprDate, KeyContact, CoreTeam, LatestLevelIssue, LatestLevelIssueDate, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, customercode)  VALUES (#{cPId} , #{cPNo} , #{cPDate} , #{cPFor} , #{process} , #{itemCode} , #{drawingName} , #{revisionNo} , #{revisionDate} , #{cPStatus} , #{custEngAppr} , #{custEngApprDate} , #{custQualAppr} , #{custQualApprDate} , #{custOtherAppr} , #{custOtherApprDate} , #{plantAppr} , #{plantApprDate} , #{suppAppr} , #{suppApprDate} , #{suppOtherAppr} , #{suppOtherApprDate} , #{keyContact} , #{coreTeam} , #{latestLevelIssue} , #{latestLevelIssueDate} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{customercode} )")
	void  saveControlplan(Controlplan controlplan);

	@Update ("UPDATE  controlplan SET CPNo = #{cPNo}, CPDate = #{cPDate}, CPFor = #{cPFor}, Process = #{process}, ItemCode = #{itemCode}, DrawingName = #{drawingName}, RevisionNo = #{revisionNo}, RevisionDate = #{revisionDate}, CPStatus = #{cPStatus}, CustEngAppr = #{custEngAppr}, CustEngApprDate = #{custEngApprDate}, CustQualAppr = #{custQualAppr}, CustQualApprDate = #{custQualApprDate}, CustOtherAppr = #{custOtherAppr}, CustOtherApprDate = #{custOtherApprDate}, PlantAppr = #{plantAppr}, PlantApprDate = #{plantApprDate}, SuppAppr = #{suppAppr}, SuppApprDate = #{suppApprDate}, SuppOtherAppr = #{suppOtherAppr}, SuppOtherApprDate = #{suppOtherApprDate}, KeyContact = #{keyContact}, CoreTeam = #{coreTeam}, LatestLevelIssue = #{latestLevelIssue}, LatestLevelIssueDate = #{latestLevelIssueDate}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, customercode = #{customercode} WHERE CPId = #{cPId} ")
	void  updateControlplan(@Param("cPId") Integer cPId);

	@Delete ("DELETE FROM controlplan WHERE CPId = #{cPId} ")
	void  deleteControlplan(@Param("cPId") Integer cPId);

}
