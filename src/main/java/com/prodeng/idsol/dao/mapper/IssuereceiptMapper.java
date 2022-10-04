package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Issuereceipt;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface IssuereceiptMapper{

	@Select ("SELECT * FROM issuereceipt")
	List<Issuereceipt> getAllIssuereceipt();

	@Select ("SELECT * FROM issuereceipt WHERE IRId = #{iRId} ")
	Issuereceipt getIssuereceipt(@Param("iRId") Integer iRId);

	@Insert ("INSERT INTO issuereceipt(IRId, IRNo, IRDate, IRType, WONo, WOSection, IRSection, EmpCode, IssueNo, ProcessFrom, ProcessTo, Remarks, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, ProdHours)  VALUES (#{iRId} , #{iRNo} , #{iRDate} , #{iRType} , #{wONo} , #{wOSection} , #{iRSection} , #{empCode} , #{issueNo} , #{processFrom} , #{processTo} , #{remarks} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{prodHours} )")
	void  saveIssuereceipt(Issuereceipt issuereceipt);

	@Update ("UPDATE  issuereceipt SET IRNo = #{iRNo}, IRDate = #{iRDate}, IRType = #{iRType}, WONo = #{wONo}, WOSection = #{wOSection}, IRSection = #{iRSection}, EmpCode = #{empCode}, IssueNo = #{issueNo}, ProcessFrom = #{processFrom}, ProcessTo = #{processTo}, Remarks = #{remarks}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, ProdHours = #{prodHours} WHERE IRId = #{iRId} ")
	void  updateIssuereceipt(@Param("iRId") Integer iRId);

	@Delete ("DELETE FROM issuereceipt WHERE IRId = #{iRId} ")
	void  deleteIssuereceipt(@Param("iRId") Integer iRId);

}
