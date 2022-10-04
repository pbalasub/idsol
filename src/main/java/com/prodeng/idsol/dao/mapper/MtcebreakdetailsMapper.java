package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Mtcebreakdetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MtcebreakdetailsMapper{

	@Select ("SELECT * FROM mtcebreakdetails")
	List<Mtcebreakdetails> getAllMtcebreakdetails();

	@Select ("SELECT * FROM mtcebreakdetails WHERE BSId = #{bSId} ")
	Mtcebreakdetails getMtcebreakdetails(@Param("bSId") Integer bSId);

	@Insert ("INSERT INTO mtcebreakdetails(BSId, BSNo, HistoryCode, BSDate, NatureOfBreak, FromBreakTimeHour, FromBreakTimeMinute, ToBreakTimeHour, ToBreakTimeMinute, TotalBreakTimeHour, TotalBreakTimeMinute, BreakStartDate, BreakEndDate, Remarks1, SupervisorName, SubOrdinateName, Remarks2, ProblemMachineCode, Reason, WorkDoneDetails, SparesReplaced, PreventiveAction, Status, Stage, RejectReason, Comments, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime)  VALUES (#{bSId} , #{bSNo} , #{historyCode} , #{bSDate} , #{natureOfBreak} , #{fromBreakTimeHour} , #{fromBreakTimeMinute} , #{toBreakTimeHour} , #{toBreakTimeMinute} , #{totalBreakTimeHour} , #{totalBreakTimeMinute} , #{breakStartDate} , #{breakEndDate} , #{remarks1} , #{supervisorName} , #{subOrdinateName} , #{remarks2} , #{problemMachineCode} , #{reason} , #{workDoneDetails} , #{sparesReplaced} , #{preventiveAction} , #{status} , #{stage} , #{rejectReason} , #{comments} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} )")
	void  saveMtcebreakdetails(Mtcebreakdetails mtcebreakdetails);

	@Update ("UPDATE  mtcebreakdetails SET BSNo = #{bSNo}, HistoryCode = #{historyCode}, BSDate = #{bSDate}, NatureOfBreak = #{natureOfBreak}, FromBreakTimeHour = #{fromBreakTimeHour}, FromBreakTimeMinute = #{fromBreakTimeMinute}, ToBreakTimeHour = #{toBreakTimeHour}, ToBreakTimeMinute = #{toBreakTimeMinute}, TotalBreakTimeHour = #{totalBreakTimeHour}, TotalBreakTimeMinute = #{totalBreakTimeMinute}, BreakStartDate = #{breakStartDate}, BreakEndDate = #{breakEndDate}, Remarks1 = #{remarks1}, SupervisorName = #{supervisorName}, SubOrdinateName = #{subOrdinateName}, Remarks2 = #{remarks2}, ProblemMachineCode = #{problemMachineCode}, Reason = #{reason}, WorkDoneDetails = #{workDoneDetails}, SparesReplaced = #{sparesReplaced}, PreventiveAction = #{preventiveAction}, Status = #{status}, Stage = #{stage}, RejectReason = #{rejectReason}, Comments = #{comments}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime} WHERE BSId = #{bSId} ")
	void  updateMtcebreakdetails(@Param("bSId") Mtcebreakdetails bSId);

	@Delete ("DELETE FROM mtcebreakdetails WHERE BSId = #{bSId} ")
	void  deleteMtcebreakdetails(@Param("bSId") Integer bSId);

}
